package TopInterviewQustions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz f = new FizzBuzz();
		List<String> res = f.fizzbuzz(15);
		System.out.println(res);
	}
	
	public List<String> fizzbuzz(int n) {
		List<String> res = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			if(i%5 == 0 && i%3 == 0) {
				res.add("FizzBuzz");
			}else if(i%5 == 0) {
				res.add("Buzz");
			}else if(i%3 == 0) {
				res.add("Fizz");
			}else {
				res.add(Integer.toString(i));
			}
		}
		return res;
	}

}
