package BasicPrograms;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		boolean printPrime=isPrime(7);		
		if(printPrime)
			System.out.println("It is a prime number " +printPrime);
		else 
			System.out.println("It is not a prime number " +printPrime);
	}
	
	public static boolean isPrime(int n) {
		if(n==1 || n==2 || n ==3)
			return true;
		else {
			int sqrt = (int)Math.sqrt(n);
			System.err.println(sqrt);
			boolean flag = true;
			for (int i = 2; i<=sqrt; i++) {
				if(n%i == 0) {
					flag = false;
					break;
				}	
			}
			System.out.println(flag);
			return flag;
		}
		
				
	}
}
