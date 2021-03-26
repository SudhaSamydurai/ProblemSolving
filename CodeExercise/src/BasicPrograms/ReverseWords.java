package BasicPrograms;

import java.util.LinkedList;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Sudha, I would like to become Test Architect!";
		System.out.println(reverseWordsInString(s));
		System.out.println(reverseWordsInString_method2(s));
	}
	
	public static String reverseWordsInString(String s) {
		String reverse = "";
		String[] words = s.split(" ");
		for(String word: words) {
			for(int i = word.length()-1; i>=0; i--) {
				reverse = reverse + word.charAt(i);
			}
			reverse = reverse + " ";
		}
		return reverse;
	}
	
	public static String reverseWords(String s) {
		int n = s.length();
		char[] reverse = s.toCharArray();
		char temp;
		for(int i=0, j=n-1; i<=j; i++, j--) {
			temp = reverse[i];
			reverse[i]= reverse[j];
			reverse[j] = temp;
		}
		return String.valueOf(reverse);
	}
	
	public static String reverseWordsInString_method2(String s) {
		String[] str = s.trim().split(" ");
		LinkedList<String> list = new LinkedList<>();
		for(int i=0; i<str.length; i++) {
			list.add(reverseWords(str[i]));
		}
		return list.toString();
	}

}
