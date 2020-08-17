package HomesiteInsuarance;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,6,4,3,1};
		BestTimeToBuyAndSellStocks b = new BestTimeToBuyAndSellStocks();
		int profit = b.maxProfit(prices);
		System.out.println(profit);
	}
	
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) {
			return 0;
		}
		
		int minPrice = prices[0];
		int profit = 0;
		
		for(int i=1;i<prices.length;i++) {
			profit = Math.max(profit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		
		return profit;
	}

}
