package MediumComplexPrograms;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
	
	HashMap<Character, Character> hmap = new HashMap<Character, Character>();
	
	public ValidParenthesis() {
		this.hmap.put(')', '(');
		this.hmap.put(']', '[');
		this.hmap.put('}', '{');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParenthesis obj = new ValidParenthesis();
		System.out.println(obj.isValid("}{(())}"));
	}
	
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length;i++) {
			char c = ch[i];
			if(this.hmap.containsKey(c)) {
				char topElement = st.empty()?'#': st.pop();
				System.out.println(topElement);
				if(topElement!=this.hmap.get(c)) {
					return false;
				}
			}else {
				st.push(c);
				System.out.println(st);
			}
		}
		return st.isEmpty();
	}
	
	
}
