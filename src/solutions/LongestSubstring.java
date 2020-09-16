package solutions;

import java.util.HashSet;

/**
 * <b>Problem :</b> Given a string s, find the length of the longest substring
 * without repeating characters.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: "abcabcbb"
 * <p>
 * Output: 3
 * <p>
 * <b>Explanation : </b> The answer is "abc", with the length of 3.
 * <p>
 * <b>Solution : </b> first is checked if there is same character in HashSet, if
 * there is, then left pointer is incremented by one, if not, current character
 * is added to the substring. Finally it is checked if current length is bigger
 * from maxLen stored in variable.
 * <p>
 * <b>Time complexity : </b> O(n)
 * 
 * <p>
 * <b>Space complexity : </b> O(n + m) where m is length of longest substring.
 *
 */
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
