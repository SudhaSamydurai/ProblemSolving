 package BasicPrograms;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCommonElement();
		printUnCommonElement();
	}
	
	public static void printCommonElement() {
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {2,5,6,7,8};
		int[] a3 = {1,2,3,4,5};
		int i=0, j=0, k=0;
		while (i< a1.length && j<a2.length && k<a3.length) {
			if(a1[i] == a2[j] && a2[j] == a3[k]) {
				System.out.println(a1[i]);
				i++;j++;k++;
			}
			else if(a1[i] < a2[j])
				i++;
			else if(a2[j] < a3[k])
				j++;
			else
				k++;
		}
		
	}
	
	public static void printUnCommonElement() {
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {2,5,6,7,8};
		int[] a3 = {1,2,3,4,5};
		int i=0, j=0, k=0;
		System.out.println("*******");
		while (i< a1.length && j<a2.length && k<a3.length) {
			if(a1[i] == a2[j] && a2[j] == a3[k]) {
				i++;j++;k++;
			}
			else if(a1[i] < a2[j]) {
				System.out.println(a1[i]);
				i++;
			}
			else if(a2[j] < a3[k]) {
					System.out.println(a2[j]);
					j++;				
			}
			else {
				System.out.println(a3[k]);
				k++;
			}
		}
		while(i<a1.length) {
			System.out.println(a1[i]);
			i++;
		}
		while(j<a2.length) {
			System.out.println(a2[j]);
			j++;
		}
	
	}
}
