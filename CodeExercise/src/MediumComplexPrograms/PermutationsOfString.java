package MediumComplexPrograms;

public class PermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringPermutations("ABC", "");
	}
	
	public static void stringPermutations(String s, String perm) {
		if(s.length() == 0 || s.equals(null)) {
			System.out.println(perm);
		}
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			//System.out.println(i);
			char ch = c[i];
			//System.out.println("ch: "+ch);
			//System.out.println("perm: "+ perm);
			String ros = s.substring(0,i)+s.substring(i+1);
			//System.out.println("ros: "+ros);
			stringPermutations(ros, perm+ch);
			}
			
	}

}
