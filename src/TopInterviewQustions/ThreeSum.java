package TopInterviewQustions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum t = new ThreeSum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(t.tSum(nums));
	}
	
	public List<List<Integer>> tSum(int[] nums) {
		Arrays.sort(nums);
		if(nums == null || nums.length == 0) {
			return new ArrayList<>();
		}
		
		List<List<Integer>> res = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++) {
			int j= i+1;
			int k = nums.length -1;
		
			if(i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			
			while(j < k) {
				if(k < nums.length - 1 && nums[k] == nums[k+1]) {
					k--;
					continue;
				}
				
				if(nums[i]+ nums[j]+ nums[k] > 0) {
					k--;
				}else if(nums[i]+nums[j]+nums[k] < 0) {
					j++;
				}else {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					
					res.add(temp);
					j++;
					k--;
				}
			}
		}
		return res;
	}

}
