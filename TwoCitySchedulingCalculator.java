package probelms;
import java.util.Arrays;
import java.util.Comparator;

public class TwoCitySchedulingCalculator {
	
	private int[][] costsForCityAandB = {{10,20},{30,200},{400,50},{30,20}};
	
	public TwoCitySchedulingCalculator(int[][] costsForCityAandB) {
		 this.costsForCityAandB = costsForCityAandB;
	}
	
	public int schedule() {
		 customSortByProfit(this.costsForCityAandB);
		 int totalPrice = calculatePrice(this.costsForCityAandB);
		 return totalPrice;
	}

	private int calculatePrice(int[][] costsForCityAandB2) {
		int price = 0;
		for(int start = 0; start < costsForCityAandB2.length / 2; start++) {
			price += costsForCityAandB2[start][0];
		}
		for(int start = 0; costsForCityAandB2.length / 2 < costsForCityAandB2.length; start++) {
			price += costsForCityAandB2[start][1];
		}
		return price;
	}

	private void customSortByProfit(int[][] costsForCityAandB2) {
		Comparator<int[]> customComp = (int[] cityA, int[] cityB) -> (cityA[0]-cityA[1]) - (cityB[0] - cityB[1]);
		Arrays.sort(costsForCityAandB2,customComp);
	}
}
