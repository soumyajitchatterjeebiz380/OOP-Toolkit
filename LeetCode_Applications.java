package probelms;

public class LeetCode_Applications {
	public static void main(String[] args) {
		int[][] amatrix = {{3,2,1},{1,7,6},{2,7,7}};
		Matrix_Common_Row_and_Col_Finder mcracf = new Matrix_Common_Row_and_Col_Finder(amatrix);
		
		// MaxNumberOfIntegerValuesInAListWithBAnnedNumbersandMaxLimitSum
		int[] bannedNumbers = {1, 6, 5};
		int range = 5;
		int maxSum = 6;
		
		MaxNumberOfIntegersToChooseFromARangeICaluclator mnoitcfaric = new MaxNumberOfIntegersToChooseFromARangeICaluclator(bannedNumbers, maxSum, range);
		System.out.println(mnoitcfaric.calculate());
		
		//Calculate Unique Substrings with checked exception handling
		
		String str = "aba";
		UniqueSusbstringCalculatorForWrapAroundStrings uscfwas = new UniqueSusbstringCalculatorForWrapAroundStrings(str);
		
		System.out.println("The unique subsrting is this:: " + uscfwas.calculateSubstring() );
		
		int[] arr = {2,0,0,1,4};
		JumpGameCalculator jgc = new JumpGameCalculator(arr);
		System.out.println(jgc.calculate());
		
	}
}


