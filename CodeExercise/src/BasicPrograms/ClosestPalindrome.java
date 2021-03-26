package BasicPrograms;

public class ClosestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =225;
		System.out.println(closestPalindrome(n));
	}
	
	static boolean isPlaindrome(int n) {
		int reverse =0;
		if(n<=0)
			return false;
		if(n<=9)
			return true;
		int num=n;
		while(num>0) {
			reverse = reverse*10+num%10;
			num/=10;
		}
		if(reverse==n)
			return true; 
		
		return false;
	}
	
	static int closestPalindrome(int n) {
		if(isPlaindrome(n))
			return n;
		for (int i = 1; ; i++) {
			if(isPlaindrome(n-i))		
				return n-i;
			if (isPlaindrome(n+i)) {
				return n+i;
				
			}
		} 
			
	}

}
