package BasicPrograms;

import java.util.Scanner;

public class Fib_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner (System.in);
		int n = getInput.nextInt();
		Fib_Recursion obj = new Fib_Recursion();
		int printFib = obj.fib(n);
		System.out.println(printFib);
		getInput.close();
	}
	
	public int fib(int n) {
		if(n==0 || n<0)
			return 0;
		if(n==1 || n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
				
	}

}
