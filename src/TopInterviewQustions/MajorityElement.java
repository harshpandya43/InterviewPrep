package TopInterviewQustions;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
		MajorityElement m = new MajorityElement();
		System.out.println(m.majorityElem(nums));
	}
	
	public int majorityElem(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		
		Arrays.sort(nums);
		return nums[nums.length/2];
	}

}
