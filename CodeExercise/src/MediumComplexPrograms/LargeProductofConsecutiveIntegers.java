package MediumComplexPrograms;

public class LargeProductofConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProduct(new int[]{6,-3,-10,0,2}));
		System.out.println(maxProduct_method2(new int[]{1,2,3,4,5}));

	}
	
	
	public static int maxProduct(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		
		int maxProduct = nums[0];
		int prevMin = nums[0];
		int PrevMax = nums[0];
		
		for(int i = 1; i<nums.length; i++) {
			int curr = nums[i];
			int maxAtPrevandCurr = PrevMax * curr;
			int minAtPrevandCurr = prevMin * curr;
			int newMax = Math.max(Math.max(curr, maxAtPrevandCurr), minAtPrevandCurr);
			int newMin = Math.min(Math.min(curr, maxAtPrevandCurr), minAtPrevandCurr);
			maxProduct = Math.max(maxProduct, newMax);
			prevMin = newMin;
			PrevMax = newMax;
		}
		return maxProduct;
	}
	
	public static int maxProduct_method2(int[] nums) {
		if(nums.length==0)
			return 0;
		int min = nums[0], max=nums[0], maxProd = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]<0)
			{
				int tmp = min;
				min = max;
				max = tmp;  
			}
			max = Math.max(nums[i], nums[i]*max);
			min = Math.min(nums[i], nums[i]*min);
			maxProd = Math.max(maxProd, max);
			
		}
		return maxProd;
	}

}
