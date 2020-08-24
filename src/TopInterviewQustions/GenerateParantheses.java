package TopInterviewQustions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParantheses g = new GenerateParantheses();
		int n = 3;
		List<String> res= g.generateParantheses(n);
		System.out.println(res);
	}
	
	public List<String> generateParantheses(int n) {
		List<String> res = new ArrayList<>();
		backtrack(res, "", 0, 0, n);
		return res;
	}

	private void backtrack(List<String> res, String current, int start, int end, int max) {
		// TODO Auto-generated method stub
		if(current.length() == max*2) {
			res.add(current);
		}
		
		if(start < max) {
			backtrack(res, current+"(", start+1, end, max);
		}
		
		if(end < start) {
			backtrack(res, current+")", start, end+1, max);
		}
	}

}
