package MediumComplexPrograms;

public class RotateArrayKtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 4};
		rotateArrayKtimes(arr, 5);
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]+ " ");
		}
	}
	
	public static void rotateArrayKtimes(int arr[], int k) {
		int length = arr.length;
		
		if(length < k)
			throw new RuntimeException("N is lesser than k");
		if(length <= 0)
			throw new RuntimeException("Array does not contain sufficient element to rotate");

		for(int i =0; i<k; i++) {
			rotateByOne(arr, length);
		}
	}
	
	public static void rotateByOne(int arr[], int n) {
		int temp = arr[0], i=0;
		for(i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}

}
