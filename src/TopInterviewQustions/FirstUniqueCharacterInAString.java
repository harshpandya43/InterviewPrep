package TopInterviewQustions;

import java.util.HashMap;
import java.util.concurrent.SynchronousQueue;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		// TODO Au	to-generated method stub
		FirstUniqueCharacterInAString f  = new FirstUniqueCharacterInAString();
		System.out.println(f.nonRepeatingIndex("leetcode"));
	}
	
	public int nonRepeatingIndex(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0; i <s.length();i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}

}
