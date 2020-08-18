package HomesiteInsuarance;

import java.util.HashSet;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,2,2};
		FindTheDuplicateNumber f = new FindTheDuplicateNumber();
		int res = f.findDuplicate(nums);
		System.out.println(res);

	}
	
	public int findDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			if(set.contains(n)) {
				return n;
			}
			set.add(n);
		}
		return -1;
	}

}
