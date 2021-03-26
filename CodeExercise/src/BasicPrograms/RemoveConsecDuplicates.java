package BasicPrograms;

public class RemoveConsecDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcs";
		removeConsecutiveDuplicates(s);
	}
 
	static void removeConsecutiveDuplicates(String s) {
		char[] ch = s.toCharArray();
		int j=0;
		for(int i=0; i<ch.length; i++) {
			boolean repeating = false;
				while (i+1<ch.length && ch[i]==ch[i+1]) {
					repeating = true;
					i++;
				}
				if(!repeating) {
//					System.out.println(ch[i+1]);
					System.out.println(ch[i]);
				}
		}
	}
}
