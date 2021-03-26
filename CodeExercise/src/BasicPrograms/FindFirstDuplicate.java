package BasicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class FindFirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFirstDuplicate_method1());
		System.out.println(findFirstDuplicate_method2());
		System.out.println(findFirstDuplicate_method3());
		System.out.println(findFirstDuplicate_method4());


	}
	
	//Brute Force Approach o(n2)
	public static int findFirstDuplicate_method1() {
		int[] a = {5,3,3,1,2, 5};
		int n = a.length;
		if(n<=0)
			return -1;
		int firstDuplicate = -1;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]==a[j]) {
					firstDuplicate = a[i];
					//break;
					return a[i];
				}					
			}
//			if(firstDuplicate>-1)
//				return firstDuplicate;
		}
		return firstDuplicate;
	}
	
	//o(n)
	public static int findFirstDuplicate_method2() {
		int[] a = {5,3,3,1,2, 0};
		int n = a.length;
		if(n<=0)
			return -1;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if(hs.add(a[i])==false)
				return a[i];
		}
		return -1;
	}

	public static int findFirstDuplicate_method3() {
		int[] a = {5,3,0,1,2, 5};
		int n = a.length;
		
		if(n<=0)
			return -1;
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			Integer count = mp.get(a[i]);
			if(count== null) 
				mp.put(a[i], 1);
			else
				mp.put(a[i], ++count);

		}
		
		for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if(entry.getValue()>1)
				return entry.getKey();
		}
		return -1;
	}
	
	public static int findFirstDuplicate_method4() {
		int[] a = {5,3,0,1,5};
		int n = a.length;
		
		if(n<=0)
			return -1;
		
		for(int i=0; i<n; i++) {
			if(a[Math.abs(a[i])]>=0) {
				System.out.println(a[Math.abs(a[i])]);
				System.out.println(-a[Math.abs(a[i])]);
				a[Math.abs(a[i])]= - Math.abs(a[i]);
			}
			else {
				return Math.abs(a[i]);
			}
		}
		return -1;

	}
}
