import java.util.HashSet;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		int leftPointer = -1;

		var substringSet = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			while (substringSet.contains(s.charAt(i))) {
				leftPointer++;
				substringSet.remove(s.charAt(leftPointer));
			}
			substringSet.add(s.charAt(i));
			if (maxLen < i - leftPointer)
				maxLen = i - leftPointer;
		}

		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("vavb"));
	}
}
