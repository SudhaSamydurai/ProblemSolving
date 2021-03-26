package MediumComplexPrograms;

public class FindMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 3, -1,-3 ,-2, -4,-3, 4, 1, 6, 7, 8,9,10,11};
		System.out.println(firstMissingPositive(nums));
	}
	
	public static int firstMissingPositive(int[] nums) {
		if(nums ==null || nums.length ==0)
			return 1;
		int length = nums.length;
		
		for(int i=0; i<length; i++) {
			int num = nums[i];
//			System.out.println("######");
//			System.out.println("Num[i]: "+nums[i]);
//			System.out.println("Nums[num-1]: "+ nums[num-1]);
//			System.out.println("*********");
			//if(length>nums[i]) {
				while(nums[i] <= length && nums[i]>0 && nums[num-1]!=num) {
					System.out.println("Num[i]: "+nums[i]);
					System.out.println("Nums[num-1]: "+ nums[num-1]);
					System.out.println("Num: "+num);
					nums[i] = nums[num-1];
					nums[num-1] = num;
					num = nums[i];
					System.out.println("After Num: "+num);

				}
				System.out.println("While loop ends here");
		//	}
			
		}
		
		for(int i=0; i<length; i++) {
			System.out.println("Array series: "+nums[i]);
		}
		
		for(int i=0; i<length;i++) {
			if(nums[i] != i+1)
				return i+1;
		}
		return length+1;
	}

}
