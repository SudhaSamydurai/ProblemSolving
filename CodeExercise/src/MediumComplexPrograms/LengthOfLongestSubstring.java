package MediumComplexPrograms;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = lengthoflongeststring("abcabcbb");
		System.out.println(a);
	}
	
	public static int lengthoflongeststring(String s) {
		int n = s.length();
		int ans = 0;
		StringBuilder c = new StringBuilder();

		int[] index = new int[128];
		for(int i=0, j=0; j<n;j++) {
			char ch = s.charAt(j);
			System.out.println("charcter: "+ch);
			System.out.println("Hashtable count: "+ index[ch]);
			
			i = Math.max(index[ch], i);
			System.out.println("i value: "+i);
			System.out.println("j value: "+j);
			System.out.println("***");
			ans = Math.max(ans, j-i+1);
			System.out.println("calculate max: " +(j-i+1));
			System.out.println("ans value:"+ans);
			index[ch] = j+1;
			System.out.println("Hashtable count: "+index[ch]);
			c.append(s.charAt(i));
			System.out.println("Range : " +c);
			System.out.println("------------------");
		}
		return ans;
	}
}
