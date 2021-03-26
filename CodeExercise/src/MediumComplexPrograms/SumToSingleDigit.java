package MediumComplexPrograms;

public class SumToSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleDigit(999));
	}
	
	static int singleDigit(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
				sum=sum+n%10;
				n/=10;
			}
			n=sum;	
		}
		return n;
	}

}
