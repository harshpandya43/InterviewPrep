package SortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort b = new BubbleSort();
		int[] nums = {64, 34, 25, 12, 22, 11, 90};
		b.sort(nums);
		for(int n : nums) {
			System.out.print(n+ " ");
		}
	}
	
	public void sort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}

}
