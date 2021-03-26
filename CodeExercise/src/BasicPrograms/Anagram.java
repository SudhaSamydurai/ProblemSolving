package BasicPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isAnagram_method1("CAT", "ACT");
		//System.out.println(isAnagram_method2("BOB", "BBO"));
		//System.out.println(isAnagram_method3("geeksforgeeks", "forgeeksgeeks"));
		System.out.println(isAnagram_method4("ABCE", "DCBA"));
	}
	
	public static boolean isAnagram_method1(String s1, String s2) {
		if(s1.isBlank() || s1.isEmpty() || s2.isBlank() || s2.isEmpty())
			return false;
		
		int s1Length = s1.length(), s2Length = s2.length();
		if(s1Length!= s2Length) 
			return false;
		
		char[] s2_toCharArray = s2.toCharArray();
		for(int i=0; i<s1Length; i++) {
			int index = s1.indexOf(s2_toCharArray[i]);
			if(index!=-1) {
				s1 = s1.substring(0, index) + s1.substring(index+1);
				System.out.println("String "+s1);
			}
			else 
				return false;
		}
		return s1.isEmpty();
	}
	
	//Time Complexity: O(nLogn)

	public static boolean isAnagram_method2(String s1, String s2) {
		if(s1.isBlank() || s1.isEmpty() || s2.isBlank() || s2.isEmpty())
			return false;
		
		int s1Length = s1.length(), s2Length = s2.length();
		if(s1Length!= s2Length) 
			return false;

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(String.valueOf(charArray1).equals(String.valueOf(charArray2))) 
			return true;
		else 
			return false;
	}
	
	public static boolean isAnagram_method3(String s1, String s2) {
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		final int maxCount = 26;
		int[] count1 = new int[maxCount];
		int[] count2 = new int[maxCount];
		
		if(char1.length != char2.length)
			return false;
		
		Arrays.fill(count1, 0);
		Arrays.fill(count2, 0);
		for(int i = 0; i<char1.length && i< char2.length; i++) {
			System.out.println(char1[i]);
			System.out.println(count1[char1[i]]++);
			System.out.println(count2[char2[i]]++);
		}
		for(int i = 0; i<maxCount; i++) {
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}
	
	//O(n)
	public static boolean isAnagram_method4(String s1, String s2) {
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		final int maxCount = 256;
		int[] count = new int[maxCount];
		
		if(char1.length != char2.length)
			return false;
		
		for(int i=0; i<char1.length; i++) {
			count[char1[i]]++;
			count[char2[i]]--;
		}
		for(int i=0; i<char1.length; i++) {
			if(count[char1[i]]>0)
				return false;
		}
		return true;

	}
}
