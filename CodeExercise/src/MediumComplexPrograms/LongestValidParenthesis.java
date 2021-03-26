package MediumComplexPrograms;

import java.util.Stack;

public class LongestValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParenthesis(")(()())"));
		//getLongestValidParenthesis(")()()(");
	}
	
	public static int longestValidParenthesis(String s) {
		int maxans = 0;
		Stack<Integer> st = new Stack<Integer>();
		st.push(-1);
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='(')
				st.push(i);
			else {
				System.out.println("before popping:"+st.peek());

				st.pop();
				if(st.isEmpty())
					st.push(i);
				else {
					maxans = Math.max(maxans, i - st.peek());
					//maxans = i;
					System.out.println("Max Ans is: "+maxans);
					System.out.println(st.peek());
				}
			}
				
		}
		return maxans;
	}
	
	//Method 2
	
	public static boolean isValid(String s) {
		int n = s.length();
		char[] chars = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i<n; i++) {
			char ch = chars[i];
			if(ch=='(') {
				st.push(ch);
			}else if(!st.isEmpty() && st.peek()=='(') {
				st.pop();
			}
			else
				return false;
		}
		return st.empty();
	}
	
	public static void getLongestValidParenthesis(String s) {
		int maxlen = 0;
		for(int i=0; i<s.length();i++) {
			for(int j= i+2;j<=s.length();j+=2) {
				System.out.println(s.substring(i,j));
				if(isValid(s.substring(i,j))) {
					System.out.println("True");
					maxlen=Math.max(maxlen, j-i);
				}
			}
		}
		System.out.println(maxlen);
	}

}
