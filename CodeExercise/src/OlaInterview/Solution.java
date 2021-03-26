package OlaInterview;

public class Solution {
//	targated String: “HelloIamsudhahello  ..helloIam soumyadiphellohell”
//	input: “hello”
//	return occurrence of “hello”
//	avoid spilt() and substring()


	public static void main( String[] args) {
		// TODO Auto-generated method stub
		String target= "HelloIamsudhahello  ..helloIam soumyadiphellohello";
		String input = "Hello";
		System.out.println(countString(target, input));
	}
	
	public static int countString(String targetString, String input) {
		int targetStrSize = targetString.length()-1;
		int inputStrSize = input.length()-1;
		if(inputStrSize>targetStrSize)
			return -1;
			
		char[] targetCharArray = targetString.toLowerCase().toCharArray();
		char[] inputCharArray = input.toLowerCase().toCharArray();
		int count = 0;
	for(int i=0; i<=targetStrSize-inputStrSize; i++) {
		for (int j = 0; j <= inputStrSize; j++) {
			if(targetCharArray[i+j] == inputCharArray[j]) {
				//i++;
				System.out.print(targetCharArray[j]);
				//System.out.println( inputCharArray[j]);
				if(j==inputStrSize) {
 					count++;
					i= i+inputStrSize;
				}	
			}
			else 
				break;	

		}
	}
		return count;
	}

}
