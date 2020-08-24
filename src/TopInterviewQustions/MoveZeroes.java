package TopInterviewQustions;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes m = new MoveZeroes();
		int[] nums = {0,1,0,3,12};
		m.moveZeroes(nums);
		for(int n : nums) {
			System.out.print(n+ " ");
		}
	}
	
	public void moveZeroes(int[] nums) {
		int i=0;
		int j=0;
		
		for(j=0;j<nums.length;j++) {
			if(nums[j]!=0) {
				nums[i] = nums[j];
				i++;
			}
		}
		
		while(i<nums.length) {
			nums[i] = 0;
			i++;
		}
	}

}
