package HomesiteInsuarance;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		MoveZeroes m = new MoveZeroes();
		m.moveZeroes(nums);
		for(int n : nums) {
			System.out.print(n+ " ");
		}
	}
	
	public void moveZeroes(int[] nums) {
		int i=0;
		int j;
		
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
