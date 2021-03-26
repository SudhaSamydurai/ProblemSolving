 package BasicPrograms;

import java.util.Arrays;

public class UnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intersection();
		union();	
	}
	
	public static void intersection() {
		int[] a = {1,3,2,5,6};
		int[] b = {2,4,5,1};
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0, j=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
				i++;
			else if (a[i]>b[j])
				j++;
			else {
				System.out.println(a[i]);
				i++;j++;
			}
		}
	}
	
	public static void union() {
		int[] a = {1,3,2,5,6};
		int[] b = {2,4,5,1};
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("******");
		int i=0, j=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			}
			else if (b[j]<a[i]) {
				System.out.println(b[j]);
				j++;
			}
			else {
				System.out.println(a[i]);
				i++;j++;
			}
		}
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		while(j<b.length) {
			System.out.println(b[i]);
			j++;
		}
	}

}
