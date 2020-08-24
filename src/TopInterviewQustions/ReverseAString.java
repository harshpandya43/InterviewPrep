package TopInterviewQustions;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString r = new ReverseAString();
		char[] c = {'h','e','l','l','o'};
		r.reverseString(c);
		for(char a : c) {
			System.out.print(a+ " ");
		}
	}
	
	public void reverseString(char[] s) {
		for(int i=0;i<Math.round(s.length/2);i++) {
			char c  = s[i];
			s[i] = s[s.length-i-1];
			s[s.length-i-1] = c;
		}
	}

}
