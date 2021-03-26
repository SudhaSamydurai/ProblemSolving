package MediumComplexPrograms;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,5,7,8,8,9,9};
		int target = 8;
		int[] temp = new int[nums.length];
		temp = searchRange(nums, target);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

	private static int extremeInsertionIndex(int[] nums, int target, boolean left) {
		int lo=0;
		int hi=nums.length;
		
		while(lo<hi) {
			int mid = (lo+hi)/2;
			System.out.println("Left Value: "+left);
			System.out.println("mid value: "+mid);
			if(nums[mid]>target || (left) && (target == nums[mid])) {
				hi = mid;
				System.out.println("Hi value: "+hi);
				System.out.println("Array value "+nums[mid]);
			}
			else {
				lo= mid+1;
				System.out.println("Lo value "+lo);
			}
		}
		return lo;
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int[] targetRange = {-1, -1};
		int leftIdx = extremeInsertionIndex(nums, target, true);
		
		if(leftIdx == nums.length || nums[leftIdx]!= target)
			return targetRange;
		
		targetRange[0] = leftIdx;
		targetRange[1] = extremeInsertionIndex(nums, target, false);
		return targetRange;
	}
}
