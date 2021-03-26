package BasicPrograms;

public class AnagramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canFormPalindrome("geeksgeeksae"));

	}
	
	public static boolean canFormPalindrome(String s) {
		char[] ch = s.toCharArray();
		int len = ch.length;
		int[] count = new int[256];
		for(int i=0; i<len; i++) {
			count[ch[i]]++;
		}
		int odd = 0;
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i] & 1);
			if((count[i] & 1) !=0) {
				odd++;
			}
			if(odd > 1)
				return false;
		}
		return true;
	}
}
