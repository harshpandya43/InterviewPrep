package HomesiteInsuarance;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String res = l.longestPalindrome(s);
		System.out.println(res);
	}
	
	public String longestPalindrome(String s) {
		String max = "";
		
		for(int i=0;i<s.length();i++) {
			String s1 = extend(s, i, i);
			String s2 = extend(s, i, i+1);
			
			if(s1.length() > max.length()) {
				max = s1;
			}
			
			if(s2.length() > max.length()) {
				max = s2;
			}
		}
		return max;
	}

	private String extend(String s, int i, int j) {
		// TODO Auto-generated method stub
		while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i+1, j);
	}
}
