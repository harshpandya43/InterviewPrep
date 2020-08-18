package HomesiteInsuarance;
import java.util.*;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		Subsets s = new Subsets();
		List<List<Integer>> res = s.subsets(nums);
		System.out.println(res);
		
	}
	
	public List<List<Integer>> subsets (int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backtrack(res, new ArrayList<>(), nums, 0);
		return res;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start) {
		// TODO Auto-generated method stub
		res.add(new ArrayList<>(tempList));
		for(int i=start;i<nums.length;i++) {
			tempList.add(nums[i]);
			backtrack(res, tempList, nums, i+1);
			tempList.remove(tempList.size()-1);
		}
	} 

}
