package MediumComplexPrograms;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 1, 3, 1, 5, 7, 9};
		nextGreaterElem(a);
	}
	
	public static void nextGreaterElem(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int index = -1;
			for (int j = i+1; j < n; j++) {
				if(a[i]<a[j]) {
					index=j;
					System.out.println("Next Greater element of "+ a[i]+ " is "+a[index]);
					break;
				}
			}
			if(index==-1)
			System.out.println(-1);
		}
	}

}
