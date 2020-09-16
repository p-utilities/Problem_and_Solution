package solutions;

/**
 * <b>Problem :</b> Given two sorted arrays nums1 and nums2 of size m and n
 * respectively, return the median of the two sorted arrays.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * <p>
 * Output: 2.00000
 * <p>
 * <b>Explanation : </b> merged array = [1,2,3] and median is 2
 * <p>
 * <b>Solution : </b> If total numbers of elements is modulo of two = 0, then
 * median is equal of two middle elements divided by 2, if not, median is middle
 * element. Since we know that arrays are sorted, that means that we only need
 * iterate over half elements. Because of that in every iteration, the index
 * pointing to the smaller element in one of the lists will be incremented until
 * the total of both indexes is equal the median. Finally the if total size of
 * both arrays is modulo of two = 0, sum of two elements are divided by two and
 * result is returned or if total size is not modulo of two = 0, encountered
 * element is returned as a result.
 * <p>
 * <b>Time complexity : </b> O(log (m+n))
 * <p>
 * <b>Space complexity : </b> O(1)
 *
 */
public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalSize = nums1.length + nums2.length;
		int median = totalSize / 2;
		double result = 0;
		if (totalSize % 2 != 0)
			median++;

		int nums1pointer = 0;
		int nums2pointer = 0;
		int currentNum = 0;
		while (true) {
			if (nums1pointer < nums1.length && nums2pointer < nums2.length) {
				if (nums1[nums1pointer] > nums2[nums2pointer]) {
					currentNum = nums2[nums2pointer];
					nums2pointer++;
				} else {
					currentNum = nums1[nums1pointer];
					nums1pointer++;
				}
			} else {
				if (nums1pointer < nums1.length) {
					currentNum = nums1[nums1pointer];
					nums1pointer++;
				} else {
					currentNum = nums2[nums2pointer];
					nums2pointer++;
				}
			}
			if (nums1pointer + nums2pointer == median) {
				result += currentNum;
				if (totalSize % 2 != 0) {
					break;
				}
			}
			if (nums1pointer + nums2pointer == median + 1) {
				result += currentNum;
				result = result / 2;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}
}
