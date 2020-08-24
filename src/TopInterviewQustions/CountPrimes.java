package TopInterviewQustions;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes c = new CountPrimes();
		System.out.println(c.countPrimes(10));
	}
	
	public int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		int count = 0;
		
		for(int i=2;i<n;i++) {
			if(notPrime[i] == false) {
				count++;
				for(int j=2;j*i<n;j++) {
					notPrime[i*j] = true;
				}
			}
		}
		return count;
	}

}
