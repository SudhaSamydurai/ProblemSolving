package MediumComplexPrograms;

public class MaximumConsecutivePositiveNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1, -2, 1, 3, -1, 1, 0, 1, 1, 2, 3, 4};
		maximumConsecPostive(a);
	}
	
	public static void maximumConsecPostive(int[] a) {
		int n = a.length;
		int currIndex=0, maxIndex=0, currLen=0, maxLen =0;
		for (int i = 0; i < n; i++) {
			if(a[i]>0) {
				System.out.println("***"+currLen);
				currLen = currLen+1;
				if(currLen ==1)
					currIndex = i;
			}
			else {
				currLen = 0;
			}
			if(currLen>maxLen) {
					maxLen = currLen;
					maxIndex = i;
				}
				
			}
		
		
		if(maxLen > 0) {
			System.out.println("positive integers starts from: "+currIndex +" end at "+ maxIndex);
		}
		else {
			System.out.println("No postive integer sequence");
		}
	}

}
