package TopInterviewQustions;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray m = new MaximumSubarray();
		int maxSum = m.maxSum(nums);
		System.out.println(maxSum);
	}
	
	public int maxSum(int[] nums) {
		if(nums.length ==0 || nums == null) {
			return 0;
		}
		
		int sum = nums[0];
		int maxSum = sum;
		
		for(int i=0; i<nums.length; i++) {
			if(sum > 0) {
				sum += nums[i];
			}else {
				sum = nums[i];
			}
			
			maxSum = Math.max(sum,  maxSum);
		}
		
		return maxSum;
	}
}
