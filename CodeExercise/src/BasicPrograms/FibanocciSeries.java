package BasicPrograms;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		int n = getInput.nextInt();
		FibanocciSeries obj = new FibanocciSeries();
		int printFib = obj.fib(n);
		//System.out.println(printFib);
	}
	
	public int fib(int n) {
		int n1 = 1, n2 = 0, n3 = 0;
		for (int i=0; i<n; i++) {
			if(n==1) {
				System.out.println("1");
				return 1;
			}
			else {
				n3 = n1+n2;
				n1 = n2;
				n2 = n3;
				System.out.println(n3);
			}
		}
		return n3;
		
	}

}
