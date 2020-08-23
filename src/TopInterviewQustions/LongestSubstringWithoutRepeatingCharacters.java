package TopInterviewQustions;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		int res = l.longestSubstring(s);
		System.out.println(res);
	}
	
	public int longestSubstring(String s) {
		if(s == null || s.length() == 0) {
			return 0;
		}
		
		int i = 0;
		int res = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		for(int j=0; j<s.length(); j++) {
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
