package Freshworks;

public class MinimumSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India, officially the Republic of India "
				+ "(Hindi: Bhārat Gaṇarājya),[23] is a country in "
				+ "South Asia. It is the second-most populous country, ";
//				+ "the seventh-largest country by area, and the most "
//				+ "populous democracy in the world. Bounded by the Indian "
//				+ "Ocean on the south, the Arabian Sea on the southwest, "
//				+ "and the Bay of Bengal on the southeast, "
//				+ "it shares land borders with Pakistan to the west; "
//				+ "China, Nepal, and Bhutan to the north; and Bangladesh "
//				+ "and Myanmar to the east. In the Indian Ocean, India is in the vicinity of Sri Lanka and the Maldives; its Andaman and Nicobar Islands share a maritime border with Thailand and Indonesia.";
		char[] vowels= {'a','e','i','o','u'};
		System.out.println("Substring: "+smallestSubstring(s, vowels));
	}
	
	public static String smallestSubstring(String s, char[] vowels) {
		char[] paragAray = s.toLowerCase().toCharArray();
		int size = paragAray.length;
		int paterrnArray = vowels.length;
		String minString = new String();
		if(paterrnArray>size)
			return "Cannot find substring of given string";
		int k=0;
		int startIndex=0, endIndex = 0, maxIndex=0, min=0;
		for(int i = 0; i<size; i++) {
			for(int j=0; j<paterrnArray;j++) {
				if(paragAray[i] == vowels[j]) {
				//k++;
				if(j==1)
					startIndex = i;
				if(j==paterrnArray-1) {
					endIndex = i;
					if(min>maxIndex) {
						min = maxIndex;
						minString = s.substring(startIndex, endIndex);
						System.out.println(minString);
//						int start = startIndex;
//						int end = endIndex;
					}
				}
				if(startIndex>0)
					maxIndex = endIndex-startIndex;	
					
			}

			else if(k==paterrnArray-1)
				k=0;
			else
				k++;
			}
			
		}
		return minString;
	}

}
