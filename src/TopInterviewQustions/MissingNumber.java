package TopInterviewQustions;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber m = new MissingNumber();
		int[] nums = {3,0,1};
		int res = m.missingNum(nums);
		System.out.println(res);
	}
	
	public int missingNum(int[] nums) {
		int sum = 0;
		
		for(int n: nums) {
			sum += n;
		}
		
		return (nums.length*(nums.length+1)) / 2 -sum ;
	}

}
