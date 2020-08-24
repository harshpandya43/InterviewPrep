package TopInterviewQustions;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray r = new RotateArray();
		int[] nums = {1,2,3,4,5,6,7};
		int k =3;
		r.rotate(nums, k);
		for(int res : nums) {
			System.out.print(res + " ");
		}
	}
	
	public void rotate(int[] nums, int k) {
		for(int i=0;i<k;i++) {
			rightRotate(nums);
		}
	}

	private void rightRotate(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int temp = nums[n-1];
		int i;
		
		for(i=n-1;i>0;i--) {
			nums[i] = nums[i-1];
		}
		nums[0] = temp;
	}

}
