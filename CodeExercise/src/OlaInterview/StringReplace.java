package OlaInterview;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaba";
		String substring = "bba";
		String key = "ab";
	System.out.println(stringReplace(s, substring, key));
	}
	
	public static String stringReplace(String str, String substring, String key) {
		String newstr = new String(str);
		int index = newstr.indexOf(key);

		while(index!=-1) {
			String firstHalf = newstr.substring(0, index);
			String mid = substring;
			String secondHalf = newstr.substring(index+key.length());

			System.out.println(index);
			System.out.println(newstr);
				newstr = firstHalf+mid+secondHalf;

			index = newstr.indexOf(key);

			}
				//newstr = newstr.substring(0, index)+substring+newstr.substring(index+key.length());
			//System.out.println(newstr);

		return newstr;
	}

}
