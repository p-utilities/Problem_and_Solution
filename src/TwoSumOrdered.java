
public class TwoSumOrdered {
	public static int[] twoSumOrdered(int[] nums, int target) {
		int firstPointer = 0, lastPointer = nums.length - 1;
		while (firstPointer < lastPointer) {
			if (nums[firstPointer] + nums[lastPointer] == target)
				return new int[] { firstPointer + 1, lastPointer + 1 };
			else if (nums[firstPointer] + nums[lastPointer] > target)
				lastPointer--;
			else
				firstPointer++;
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] s = twoSumOrdered(new int[] { 2, 3, 5, 6, 8, 9, 10, 12, 50 }, 15);
		for (int p : s)
			System.out.println(p);
	}
}
