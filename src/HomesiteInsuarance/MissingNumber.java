package HomesiteInsuarance;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,0,1};
		MissingNumber m = new MissingNumber();
		int res = m.missingNumber(nums);
		System.out.println(res);
	}
	
	public int missingNumber(int[] nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		
		return (nums.length * (nums.length + 1)) / 2 - sum;
	}

}
