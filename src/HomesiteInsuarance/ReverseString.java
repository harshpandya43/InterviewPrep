package HomesiteInsuarance;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'h','e','l','l','o'};
		ReverseString r = new ReverseString();
		r.reverse(c);
		
		for(char a : c) {
			System.out.print(a);
		}
	}
	
	public void reverse(char[] s) {
		if(s == null || s.length == 0) {
			return;
		}
		
		for(int i=0;i<Math.round(s.length / 2); i++) {
			char c = s[i];
			s[i] = s[s.length - i -1];
			s[s.length - i - 1] = c;
		}
	}

}
