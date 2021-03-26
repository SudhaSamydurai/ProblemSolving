package MediumComplexPrograms;

public class RotateArrayInSubsetofK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6};
		int k = 2;
		rotateSubsetOfK(a, k);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void rotateSubsetOfK(int arr[], int k) {
		int n = arr.length;
		for (int i=0; i<n; i=i+k) {
			int left = i, right = Math.min(i+k-1, n-1);
			int temp;
			while(left<right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
	}

}
