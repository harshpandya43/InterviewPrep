package TopInterviewQustions;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParantheses v = new ValidParantheses();
		String s = "()";
		System.out.println(v.isValid(s));
	}
	
	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(map.keySet().contains(c)) {
				stack.push(c);
			}else if(map.values().contains(c)) {
				if(!stack.isEmpty() && map.get(stack.peek()) == c) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
