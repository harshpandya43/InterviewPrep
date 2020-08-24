package TopInterviewQustions;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfThree p = new PowerOfThree();
		System.out.println(p.isPowerOfThree(27));
	}
	
	public boolean isPowerOfThree(int n) {
		if(n < 1) {
			return false;
		}
		
		while(n%3 == 0) {
			n=n/3;
		}
		
		return n == 1;
	}

}
