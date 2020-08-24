package TopInterviewQustions;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber s = new SingleNumber();
		int[] nums = {2,2,1};
		System.out.println(s.singleNumber(nums));
	}
	
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int n : nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		
		for(int n: nums) {
			if(map.get(n) == 1) {
				return n;
			}
		}
		return -1;
	}
	

}
