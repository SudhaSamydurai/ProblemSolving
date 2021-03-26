package MediumComplexPrograms;

public class PushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,0,0,4,0,0,0,5,6,8,1,0,0};
		pushZerosToEnd(arr);
	}
	
	static void pushZerosToEnd(int[] n) {
		int length = n.length;
		int i=0, j= length-1;
		
		while(i<j) {
			if(n[i]==0 && n[j]>0) {
				n[i]=n[j];
				n[j]=0;
				i++;
				j--;
			}
			if(n[i]!=0) {
				i++;
			}
			if(n[j]==0 ) 
				j--;
			System.out.println("i value "+i);
			System.out.println("j value "+j);

		}
		
		for(int k=0; k<length; k++) {
			System.out.println(n[k]);
		}
	}

}
