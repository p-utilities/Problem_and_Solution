package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class The3Sum {
	public static List<List<Integer>> threeSum(int[] nums) {
		var set = new HashSet<List<Integer>>();

		for (int i = 0; i < nums.length - 3; i++) {
			if (nums[i] + nums[i + 1] + nums[i + 2] == 0) {
				var curr = Arrays.asList(nums[i], nums[i + 1], nums[i + 2]);
				Collections.sort(curr);
				set.add(curr);
			}
		}

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				if (nums[i] + nums[j] + nums[j + 1] == 0) {
					var curr = Arrays.asList(nums[i], nums[j], nums[j + 1]);
					Collections.sort(curr);
					set.add(curr);
				}
			}
		}

		return new ArrayList<List<Integer>>(set);
	}

	public static void main(String[] args) {
		System.out.println("start");
		var s = threeSum(new int[] { -1, 0, 1, 0 });
		for (List<Integer> p : s) {
			for (Integer i : p)
				System.out.print(i + ", ");
			System.out.println();
		}
	}

}
