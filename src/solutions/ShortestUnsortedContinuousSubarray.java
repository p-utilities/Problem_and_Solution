package solutions;

public class ShortestUnsortedContinuousSubarray {
	public static int findUnsortedSubarray(int[] nums) {
		int firstIndex = findFirstIndex(nums);
		int lastIndex = findLastIndex(nums);
		if(firstIndex - lastIndex == 0)
			return 0;
		return lastIndex - firstIndex;
	}

	private static int findFirstIndex(int[] nums) {
		int firstIndex = -1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				firstIndex = i;
				break;
			}
		}
		
		if (firstIndex == -1)
			return -1;

		for (int i = firstIndex; i > 0; i--) {
			if (nums[firstIndex] < nums[firstIndex - 1])
				firstIndex = i;
		}
		return firstIndex;
	}

	private static int findLastIndex(int[] nums) {
		int lastIndex = -1;
		for (int i = nums.length - 1; i >= 1; i--) {
			if (nums[i] < nums[i - 1]) {
				lastIndex = i;
				break;
			}
		}

		if (lastIndex == -1)
			return -1;

		for (int i = lastIndex; i < nums.length-1; i++) {
			if (nums[lastIndex] < nums[lastIndex + 1])
				lastIndex = i;
		}

		return lastIndex - 1;
	}

	public static void main(String[] args) {
		System.out.println(findUnsortedSubarray(new int[] {}));
	}

}
