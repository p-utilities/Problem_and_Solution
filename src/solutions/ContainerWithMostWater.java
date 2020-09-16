package solutions;

/**
 * <b>Problem :</b> Given n non-negative integers a1, a2, ..., an , where each
 * represents a point at coordinate (i, ai). n vertical lines are drawn such
 * that the two end points of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container
 * contains the most water.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: [1,8,6,2,5,4,8,3,7]
 * <p>
 * Output: 49
 * <p>
 * <b>Explanation : </b> square with largest area is from index 1 to index 8.
 * That means that one side of the square is biggerIndex - smallerIndex. Other
 * side of the square is smaller value in that array on those indexes. So, final
 * result is 7 * 7 = 49.
 * <p>
 * <b>Solution : </b> My solution uses two variables, first pointing to the
 * first element in the array and second pointing to the last element in the
 * array. In each iteration area of square using those indexes is calculated and
 * compared to the maxArea and if calculated are is bigger, then that value is
 * set as maxArea. In each step, index which has smaller value in array is
 * incremented by one.
 * <p>
 * <b>Time complexity : </b> since every element is visited, the time complexity
 * of this solution is O(n).
 * <p>
 * <b>Space complexity : </b> space complexity for this solution is constant or
 * O(1).
 *
 */
public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int startIndex = 0;
		int endIndex = height.length - 1;
		int maxArea = 0;

		while (startIndex < endIndex) {
			int currentMaxArea = 0;
			if (height[startIndex] < height[endIndex]) {
				currentMaxArea = height[startIndex] * (endIndex - startIndex);
				startIndex++;
			} else {
				currentMaxArea = height[endIndex] * (endIndex - startIndex);
				endIndex--;
			}

			if (currentMaxArea > maxArea)
				maxArea = currentMaxArea;
		}

		return maxArea;
	}

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}
}
