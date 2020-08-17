package HomesiteInsuarance;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray m = new MaximumSubarray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = m.maxSum(nums);
		System.out.println(maxSum);
	}
	
	public int maxSum(int[] nums) {
		if(nums == null || nums.length ==0) {
			return 0;
		}
		
		int sum = nums[0];
		int maxSum = sum;
		
		for(int i=1;i<nums.length;i++) {
			if(sum > 0) {
				sum+=nums[i];
			}else {
				sum = nums[i];
			}
			
			maxSum = Math.max(sum, maxSum);
		}
		
		return maxSum;
	}

}
