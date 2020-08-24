package TopInterviewQustions;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidAnagram v = new ValidAnagram();
		System.out.println(v.isValidAnagram("anagram", "nagaram"));
	}
	
	public boolean isValidAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		String s1 = s.toLowerCase();
		String s2 = t.toLowerCase();
		
		int letters[] = new int[256];
		
		for(char c : s1.toCharArray()) {
			letters[c]++;
		}
		
		for(char c: s2.toCharArray()) {
			letters[c]--;
		}
		
		for(int i : letters) {
			if(i!=0) {
				return false;
			}
		}
		
		return true;
	}

}
