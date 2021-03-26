package BasicPrograms;

import java.util.Scanner;

public class FindNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter how many input you want");
		int n = obj.nextInt();
		System.out.println("Enter all inputs");
		int[] array = new int[n];
		for (int i=0; i<n; i++) {
			array[i] = obj.nextInt();
		}
		System.out.println(findNumber(array, 5));

	}
	
	public static boolean findNumber(int[] number, int toFind) {
		int length = number.length;
		boolean isFound = false;
		if(length<=0)
			return false;
		for(int i=0; i<length;i++) {
			if(number[i] == toFind) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}

}
