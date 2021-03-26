package MediumComplexPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringSubset("fun");
	}
	
	static void stringSubset(String s) {
		Set<String> hs = new TreeSet<String>();
		int n = s.length();
		String[] str = new String[n*(n+1)/2];
		int k=0;
		for(int i=0; i<n; i++) {
			for(int j = i; j<n; j++) {
				str[k++] = s.substring(i, j+1);
				//hs.add(s.substring(i, j));
			}
		}
		System.out.println(Arrays.toString(str));
		System.out.println(hs.toString());

	}

}
