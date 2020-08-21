package HomesiteInsuarance;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParantheses g = new GenerateParantheses();
		List<String> res = g.generateParanthese(3);
		System.out.println(res);
	}
	
	public List<String> generateParanthese(int n) {
		List<String> res = new ArrayList<>();
		backtrack(res, "", 0, 0, n);
		return res;
	}

	private void backtrack(List<String> res, String curr, int open, int close, int max) {
		// TODO Auto-generated method stub
		
		if(curr.length() == max * 2) {
			res.add(curr);
		}
		
		if(open < max) {
			backtrack(res, curr+"(", open+1, close, max);
		}
		
		if(close < open) {
			backtrack(res, curr+")", open, close + 1, max);
		}
		
	}

}
