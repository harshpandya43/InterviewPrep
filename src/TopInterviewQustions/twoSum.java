package TopInterviewQustions;
import java.util.*;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoSum t = new twoSum();
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] res = t.sol(nums, target);
		
		for(int r : res) {
			System.out.println(r);
		}
	}
	
	public int[] sol(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {map.get(complement), i};
			}
		}
		
		return new int[] {-1,-1};
	}

}
