package HomesiteInsuarance;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsecutiveOnes m = new MaxConsecutiveOnes();
		int nums[] = {1,1,0,1,1,1,1};
		int sol = m.sol(nums);
		System.out.println(sol);
	}
	
	public int sol(int[] nums) {
		int count = 0;
		int maxCount = 0;
		
		for(int n : nums) {
			if(n == 1) {
				count++;
			}else {
				count = 0;
			}
			maxCount = Math.max(count, maxCount);
		}
		return maxCount;
	}

}
