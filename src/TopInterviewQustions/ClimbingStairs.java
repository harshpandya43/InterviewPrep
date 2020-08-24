package TopInterviewQustions;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs c = new ClimbingStairs();
		System.out.println(c.numberOfWays(3));
	}
	
	public int numberOfWays(int n) {
		if(n == 1) {
			return 1;
		}
		
		int first = 1;
		int second = 2;
		
		for(int i=3;i<=n;i++) {
			int third = first+second;
			first = second;
			second = third;
		}
		return second;
	}

}
