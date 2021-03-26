package BasicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FirstNonRepeated obj = new FirstNonRepeated();
		System.out.println("First Non-Repeated character: "+firstNonRepeated("sssuuddhhaa"));
		System.out.println("First Non-Repeated character: "+firstNonRepeated_method2("sssuddhhaa"));

	}
	
	public static String firstNonRepeated(String s) {
		
		if(s.length()==0 || s.isBlank())
			return "";
		 
		List<Character> nonRepeatedChar = new ArrayList<Character>();
		Set<Character> repeated = new HashSet<Character>();
		char[] letter = s.toLowerCase().toCharArray();
		for(int i=0; i<s.length();i++) {
			
			if(repeated.contains(letter[i]))
				continue;
			
			else if(nonRepeatedChar.contains(letter[i])) {
				repeated.add(s.charAt(i));
				nonRepeatedChar.remove((Character) letter[i]);
			}
			
			else
				nonRepeatedChar.add(letter[i]);
			}
		if(nonRepeatedChar.size()>0)
			
			return nonRepeatedChar.get(0).toString();
		else 
			return null;
		}
	
	public static String firstNonRepeated_method2(String s) {
		
		if(s.length()==0 || s.isBlank())
			return "";
		
		final int maxchar = 256; 
		int[] count = new int[maxchar];
		
		int length = s.length();
		char[] letter = s.toCharArray();
		
		for(int i=0; i<length; i++) {
			count[letter[i]]++;
		}
		
		for(int i=0; i<length; i++) {
			
			if(count[letter[i]] == 1)
				return String.valueOf(letter[i]);
		}
		return null;
	}
		
	}
