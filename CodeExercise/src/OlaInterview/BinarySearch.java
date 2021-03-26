package OlaInterview;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,3,6,1,2,4};
		int key = 2;
		System.out.println(searchElement(a, key));
		//searchElement(a, key);
	}
	
	public static boolean searchElement(int arr[], int searcKey) {
		Arrays.sort(arr);
		int size = arr.length;
//		System.ou;/t.println(arr[4]);
		int low =0;
		int high = size;
//		System.out.println(high);
//		int mid = low+(high-low)/2;
//		System.out.println(mid);

		while (low<=high) {
			int mid = low+(high-low)/2;

			System.out.println(mid);
			System.out.println(arr[mid]);
			if(arr[mid] == searcKey)
				return true;
			
				if(arr[mid]<searcKey) {
					low =mid+1;
//					System.out.println(low);
				}			
				else {
					high = mid-1;
//					System.out.println(high);
				}
			
			
				
		}
		return false;
	}
	
}
