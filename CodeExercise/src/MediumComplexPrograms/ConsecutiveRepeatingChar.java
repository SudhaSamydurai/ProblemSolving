package MediumComplexPrograms;

public class ConsecutiveRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countConsecutiveString("AABBA");
	}
	
	public static void countConsecutiveString(String s) {
		char[] ch = s.toCharArray();
		int n = ch.length;

		for(int i=0; i<n;i++) {
			int count = 1;
			while(i+1<n && ch[i] == ch[i+1]) {
				count++;
				i++;
			}
			System.out.print(String.valueOf(ch[i]));
			System.out.print(count);
		}
	}
}
