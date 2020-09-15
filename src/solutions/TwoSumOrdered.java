package solutions;

/**
 * <b>Problem :</b> Given an array of ordered integers nums and an integer
 * target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice. You can return the answer in any order.
 * <p>
 * <b> Example : </b>
 * <p>
 * Input: nums = [1,2,4], target = 6
 * <p>
 * Output: [1,2]
 * <p>
 * - integer on index 1 and index 2 sum up to target. Return value is indexes of
 * values in array that sum up to the target value.
 * <p>
 * <b>Solution</b> : I used two variables with values 0 and length of array - 1
 * that represent left and right point of the array. In each iteration, if sum
 * of values on indexes of those variables are smaller then the target, the
 * smaller variable is incremented by one. Otherwise, larger is incremented by
 * one. When total of two values is equal to target value, variables (left and
 * right points) will be stored inside new array of integers and will be
 * returned.
 * <p>
 * If there is not values in an array that sum up to the target value, return
 * will be empty array of integers.
 */
public class TwoSumOrdered {
	public static int[] twoSumOrdered(int[] nums, int target) {
		if (nums != null) {
			int firstPointer = 0, lastPointer = nums.length - 1;
			while (firstPointer < lastPointer) {
				if (nums[firstPointer] + nums[lastPointer] == target)
					return new int[] { firstPointer, lastPointer };
				else if (nums[firstPointer] + nums[lastPointer] > target)
					lastPointer--;
				else
					firstPointer++;
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] t = new int[] { 0, 1, 2, 3, 4, 5 };
		int[] s = twoSumOrdered(t, 6);
		for (int p : s)
			System.out.println(p);
		System.out.println(t[s[0]] + t[s[1]]);
		System.out.println("dne");
	}
}
