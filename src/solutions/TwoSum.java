package solutions;

/**
 * <b>Problem :</b> Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target. You may
 * assume that each input would have exactly one solution, and you may not use
 * the same element twice. You can return the answer in any order.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: nums = [3,2,4], target = 6
 * <p>
 * Output: [1,2]
 * <p>
 * <b>Explanation : </b> integer on index 1 and index 2 sum up to target. Return
 * value is indexes of values in array that sum up to the target value.
 * <p>
 * <b>Solution : </b> for each element, check the right side if there is an
 * element that sum with current element is equal to the target value. if does,
 * return those indexes.
 * <p>
 * <b>Time complexity : </b> O(n log n)
 * <p>
 * <b>Space complexity : </b> O(1)
 *
 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int firstIndex = 0;
		int lastIndex = -1;
		for (firstIndex = 0; firstIndex < nums.length; firstIndex++) {
			int rest = target - nums[firstIndex];
			for (int i = firstIndex + 1; i < nums.length; i++) {
				if (nums[i] == rest) {
					lastIndex = i;
					break;
				} else if (nums[i] > rest)
					continue;
			}
			if (lastIndex != -1)
				break;
		}

		return new int[] { firstIndex, lastIndex };
	}

	public static void main(String[] args) {
		int[] s = twoSum(new int[] { 3, 2, 4 }, 6);
		for (int p : s)
			System.out.println(p);
	}
}
