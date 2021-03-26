package BasicPrograms;

import java.util.Scanner;

public class FindTopTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the limit of array: ");
		int n = obj.nextInt();
		int[] a = new int[n];
		System.out.println("Enter All Values in array");
		for(int i=0; i<n; i++) {
			a[i] = obj.nextInt();
		}
		findTopTwoMaximumNumber(a);
		findTopTwoMinimumNumber(a);
		obj.close();
	}

	public static void findTopTwoMaximumNumber (int[] array) {
		int n = array.length;
		if(n==0 || n==1)
			System.out.println("Please enter atleast 2 input in the array");
		
	//	int maxOne = Integer.MIN_VALUE, maxTwo = Integer.MIN_VALUE;
		int maxOne = 0, maxTwo = 0;
 
		for(int i=0; i<n; i++) {
			if(maxOne < array[i]) {
				maxTwo = maxOne;
				maxOne = array[i];
			}
			if(maxTwo < array[i] && maxOne > array[i] )
				maxTwo = array[i];
		}
		System.out.println("Max 1 is: "+ maxOne);
		System.out.println("Max 2 is: "+ maxTwo);
	}
	
	public static void findTopTwoMinimumNumber (int[] array) {
		int n = array.length;
		if(n==0 || n==1)
			System.out.println("Please enter atleast 2 input in the array");
		
		int maxOne = Integer.MAX_VALUE, maxTwo = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(array[i] < maxOne) {
				maxTwo = maxOne;
				maxOne = array[i];
			}
			if(array[i] < maxTwo && maxOne < array[i] )
				maxTwo = array[i];
		}
		System.out.println("Min 1 is: "+ maxOne);
		System.out.println("Min 2 is: "+ maxTwo);
	}
}
