package TopInterviewQustions;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
		System.out.println(r.removeDuplicate(nums));
	}
	
	public int removeDuplicate(int[] nums) {
		int j=0;
		int i=1;
		
		while(i<nums.length) {
			if(nums[j] != nums[i]) {
				j++;
				nums[i] = nums[j];
			}
			i++;
		}
		return j+1;
	}

}
