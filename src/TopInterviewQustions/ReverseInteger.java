package TopInterviewQustions;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger r = new ReverseInteger();
		int res = r.reverse(123);
		System.out.println(res);
	}
	
	public int reverse(int n) {
		boolean sign = false;
		
		if(n < 0) {
			sign = true;
			n = 0-n;
		}
		
		long res = 0;
		int p = n;
		
		while(p > 0) {
			int mod = p%10;
			p=p/10;
			res = res*10+mod;
		}
		
		if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
			return 0;
		}
		
		if(sign) {
			res = -res;
		}
		
		return (int)res;
	}

}
