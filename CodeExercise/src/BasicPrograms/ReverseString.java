package BasicPrograms;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString_method1(null);
		reverseString_method2("ABCD");
	}
	
	public static String reverseString_method1(String s) {
		String original = s;
		String reverse = null;
		if(original == null || original.isBlank())
			return "";
		int length = original.length();
		char[] charArray = original.toCharArray();
		for (int i=length-1; i>=0; i--) {
			reverse = reverse+charArray[i];
		}
		System.out.println(reverse);
		return reverse;
	}
	
	public static String reverseString_method2(String s) {
		String original = s;

		if(original == null || original.isBlank())
			return "";
		
		int length = original.length();
		char[] charArray = original.toCharArray();
		int start =0, end = length-1, mid = end/2;
		char a, b;

		for (int i=0; i<=mid; i++) {
			a=charArray[start]; 
			b=charArray[end];
			charArray[start] = b;
			charArray[end] = a;
			start++; end--;
		}
		original = String.valueOf(charArray);
		System.out.println(original);
		return original;
	}

}
