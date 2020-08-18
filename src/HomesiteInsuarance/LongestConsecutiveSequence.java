package HomesiteInsuarance;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		int[] nums = {100, 4, 200, 1, 3, 2};
		int length = l.lengthOfLongestSequence(nums);
		System.out.println(length);
	}
	
	public int lengthOfLongestSequence(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		HashSet<Integer> set = new HashSet<>();
		int res = 0;
		
		for(int n : nums) {
			set.add(n);
		}
		
		for(int n : nums) {
			int count = 1;
			int down = n - 1;
			
			while(set.contains(down)) {
				set.remove(down);
				count++;
				down--;
			}
			
			int  up = n + 1;
			
			while(set.contains(up)) {
				set.remove(up);
				up++;
				count++;
			}
			
			res = Math.max(count, res);
		}
		
		return res;
	}

}
