package HomesiteInsuarance;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		String s = "abcabcbb";
		int res = l.longestSubstring(s);
		System.out.println(res);
	}
	
	public int longestSubstring(String s) {
		if(s == null || s.length() == 0 ) {
			return 0;
		}
		
		HashSet<Character> set = new HashSet<>();
		int i= 0;
		int res = 1;
		
		for(int j=0;j<s.length();j++) {
			char c = s.charAt(j);
			
			if(!set.contains(c)) {
				set.add(c);
				res = Math.max(res, set.size());
			}else {
				while(i < j) {
					if(s.charAt(i) == c) {
						i++;
						break;
					}
					set.remove(s.charAt(i));
					i++;
				}
			}
		}
		return res;
		
	}

}
