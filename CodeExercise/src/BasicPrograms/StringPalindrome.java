package BasicPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		String getString = obj.nextLine();
		System.out.println(isPalindromeString_Method1(getString));
		System.out.println(isPalindromeString_Method2(getString));
		System.out.println(isPalindromeString_Method3(getString));
	}
	
	public static boolean isPalindromeString_Method1(String s) {
		String original = s;
		String reverse = "";
		int length = original.length();
		
		if(length==0 || length <0)
			return false;
		
		char[] charArray = original.toCharArray();
		for(int i =length-1; i>=0; i--) {
			reverse = reverse + charArray[i];
		}
		if(original.equals(reverse))
			return true;
		else 
			return false;
	}
	
	public static boolean isPalindromeString_Method2(String s) {
		int length = s.length();
		int start = 0;
		int end = length-1;
		int mid = end/2;
		char[] charArray = s.toCharArray();
		int i = 0;
		for(i=start; i<=mid; i++) {
			if(charArray[start]==charArray[end]) {
				start++;
				end--;
			}else
				break;
		}
		if(i==mid+1) {
			System.out.println("Given String is Palindrome");
			return true;
		}
		else {
			System.out.println("Given String is not a Palindrome");
			return false;
		}
	}
	
	public static boolean isPalindromeString_Method3(String s) {
		int length = s.length();
		int start = 0;
		int end = length-1;
		int mid = end/2;
		char[] charArray = s.toCharArray();
		int i = 0;
		for(i=0; i<=mid; start++, end--, i++) {
			if(charArray[start]==charArray[end]) {
				continue;
			}else
				break;
		}
		if(i==mid+1) {
			System.out.println("Given String is Palindrome");
			return true;
		}
		else {
			System.out.println("Given String is not a Palindrome");
			return false;
		}
	}
}
