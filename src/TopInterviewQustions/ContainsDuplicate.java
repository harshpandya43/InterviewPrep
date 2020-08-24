package TopInterviewQustions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicate c = new ContainsDuplicate();
		int[] nums = {1,2,3,1};
		System.out.println(c.hasDuplicate(nums));
	}
	
	public boolean hasDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int n : nums) {
			if(!set.contains(n)) {
				set.add(n);
			}else {
				System.out.println(n);
				return true;
			}
		}
		return false;
	}

}
