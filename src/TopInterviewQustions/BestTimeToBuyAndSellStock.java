package TopInterviewQustions;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
		int profit = b.maxProfit(prices);
		System.out.println(profit);
	}
	
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) {
			return 0;
		}
		
		int maxPro = 0;
		int minPrice = prices[0];
		
		for(int i=1;i<prices.length;i++) {
			maxPro = Math.max(maxPro, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		
		return maxPro;
	}

}
