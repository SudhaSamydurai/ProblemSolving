package BasicPrograms;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//removeDuplicates();
		removeDuplicates_01();
	}
	
	public static void removeDuplicates() {
		int[] a = {1,2,1,3,2,4};
		int n = a.length;
		int[] temp = new int[n];
		int j = 0;
		Arrays.sort(a);
		for (int i=0; i<n-1; i++) {
				if(a[i]!= a[i+1]) {
					temp[j++] = a[ i];
			}
		}
		temp[j++] = a[n-1];
		
		for(int i=0; i<j; i++) {
			a[i] = temp[i];
			System.out.println(a[i]);
		}
	}
	
	public static void removeDuplicates_01() {
		int[] a = {1,2,2,3,3,4,5};
		int n = a.length;
		Arrays.sort(a);
		int previous = a[0];
		for(int i=0; i<n; i++) {
			int next = a [i];
			if(previous != next) {
				a[i] = next;
				System.out.println(a[i]);
			}
			previous = next;
		}
		//System.out.println(Arrays.toString(a));
	}

}
