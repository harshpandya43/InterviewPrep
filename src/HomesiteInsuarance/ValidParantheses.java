package HomesiteInsuarance;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParantheses v = new ValidParantheses();
		boolean ans = v.isValid("()");
		System.out.println(ans);
	}
	
	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(map.keySet().contains(s.charAt(i))) {
				stack.push(s.charAt(i));
			}else if(map.values().contains(s.charAt(i))) {
				if(map.get(stack.peek()) == s.charAt(i) && !stack.isEmpty()) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
