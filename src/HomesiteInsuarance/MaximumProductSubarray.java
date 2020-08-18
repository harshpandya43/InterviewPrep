package HomesiteInsuarance;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumProductSubarray m  = new MaximumProductSubarray();
		int[] nums = {2,3,-2,4};
		int res = m.maxProduct(nums);
		System.out.println(res);
	}
	
	public int maxProduct(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int min = nums[0];
		int max = nums[0];
		int res = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			int temp = max;
			
			max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
			min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
			
			if(max > res) {
				res = max;
			}
		}
		return max;
		
	}

}
