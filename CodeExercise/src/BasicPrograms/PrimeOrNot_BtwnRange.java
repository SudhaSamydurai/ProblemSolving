package BasicPrograms;

public class PrimeOrNot_BtwnRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_BetweenRange();
	}
	
	public static void Prime_BetweenRange() {
		int low = 10, high = 20, flag = 1;
		if(low>high) 
			System.out.println("Please enter low less than high");
		
		while (low<high) {
			int sqrt = (int) Math.sqrt(low);
			for (int i = 2; i<sqrt; i++) {
				if(low%i == 0) {
					flag = 0;
					break;
				}	
			}
			if(flag == 1) {
				System.out.println(low+ " is a Prime number");
			}
			low++;
			flag = 1;
		}
	}

}
