package BasicPrograms;

public class Max_ContigiousSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2, -3, 4, -1, -2,1, 5, -3};
		System.out.println(contigious_sum(a));

	}
	
	public static int contigious_sum(int a[]) {
		int length = a.length;
		int max_so_far = 0;
		int max_Ending_Here = 0;
		for(int i =0; i< length; i++) {
			max_Ending_Here = max_Ending_Here + a[i];
			if(max_so_far<max_Ending_Here) {
				max_so_far = max_Ending_Here;
System.out.println(max_so_far);
			}
			if(max_Ending_Here<0)
				max_Ending_Here = 0;
			System.out.println("max"+max_Ending_Here);
		}
		return max_so_far;
		}

}
