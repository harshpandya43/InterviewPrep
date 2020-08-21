package HomesiteInsuarance;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();
		int res = f.findUniqueCharacter("harsh");
		System.out.println(res);
	}
	
	public int findUniqueCharacter(String s) {
		if(s == null || s.length() == 0) {
			return -1;
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

}
