package probelms;

public class BestTimeToBuyStocksFinder {
	private int[] prices;

	public BestTimeToBuyStocksFinder(int[] prices) {
		super();
		this.prices = prices;
	}

	public int[] getPrices() {
		return prices;
	}

	public void setPrices(int[] prices) {
		this.prices = prices;
	}
	
	public int calculate() {
        int maxProfit = 0;
        int currBuy = prices[0];
        int currIdx = 1;

        while(currIdx < prices.length) {
            if(currBuy < prices[currIdx]) {
                maxProfit = Math.max(maxProfit,prices[currIdx] - currBuy );
            }else{
                currBuy = prices[currIdx];
            }
            currIdx++;
        }

        return maxProfit;
    }
	
}
