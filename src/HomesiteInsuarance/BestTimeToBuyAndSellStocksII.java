package HomesiteInsuarance;

public class BestTimeToBuyAndSellStocksII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeToBuyAndSellStocksII b = new BestTimeToBuyAndSellStocksII();
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = b.maxProfit(prices);
		System.out.println(maxProfit);
	}
	
	public int maxProfit(int[] nums) {
		int maxP = 0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i+1] - nums[i] > 0) {
				maxP = maxP + (nums[i+1] - nums[i]);
			}
		}
		return maxP;
	}

}
