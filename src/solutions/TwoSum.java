package solutions;

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
			if(lastIndex != -1)
				break;
		}

		return new int[] { firstIndex, lastIndex };
	}
	
	public static void main(String[] args) {
		int[] s = twoSum(new int[] {3,2,4}, 6);
		for(int p:s)
			System.out.println(p);
	}
}
