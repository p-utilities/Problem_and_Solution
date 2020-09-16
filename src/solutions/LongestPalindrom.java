package solutions;

/**
 * <b>Problem :</b> Given a string s, find the longest palindromic substring in
 * s. You may assume that the maximum length of s is 1000.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: "babad"
 * <p>
 * Output: "aba" or "bab"
 * <p>
 * <b>Explanation : </b> classic palindrome.
 * <p>
 * <b>Solution : </b> in each iteration, size of possible maximum length
 * palindome is decremented and for all posible solutions of that length in
 * provided string, substring is checked if it is palindome. If it is, that
 * substring is returned.
 * <p>
 * <b>Time complexity : </b> I think that time complexity for this solution is
 * O(n log n)
 * <p>
 * <b>Space complexity : </b> space complexity for this solution is O(1)
 *
 */
public class LongestPalindrom {
	public static String longestPalindrome(String s) {
		int maxLen = s.length() - 1;
		int startIndex = 0;
		outer: while (true) {
			for (int i = 0; i <= s.length() - 1 - maxLen; i++) {
				if (isPalindromic(s, i, i + maxLen)) {
					startIndex = i;
					break outer;
				}
			}
			maxLen--;
		}

		return s.substring(startIndex, startIndex + maxLen + 1);
	}

	public static boolean isPalindromic(String s, int indexOne, int indexTwo) {
		if (indexOne >= indexTwo)
			return true;
		if (s.charAt(indexOne) == s.charAt(indexTwo))
			return isPalindromic(s, indexOne + 1, indexTwo - 1);
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome(
				"azwdzwmwcqzgcobeeiphemqbjtxzwkhiqpbrprocbppbxrnsxnwgikiaqutwpftbiinlnpyqstkiqzbggcsdzzjbrkfmhgtnbujzszxsycmvipjtktpebaafycngqasbbhxaeawwmkjcziybxowkaibqnndcjbsoehtamhspnidjylyisiaewmypfyiqtwlmejkpzlieolfdjnxntonnzfgcqlcfpoxcwqctalwrgwhvqvtrpwemxhirpgizjffqgntsmvzldpjfijdncexbwtxnmbnoykxshkqbounzrewkpqjxocvaufnhunsmsazgibxedtopnccriwcfzeomsrrangufkjfzipkmwfbmkarnyyrgdsooosgqlkzvorrrsaveuoxjeajvbdpgxlcrtqomliphnlehgrzgwujogxteyulphhuhwyoyvcxqatfkboahfqhjgujcaapoyqtsdqfwnijlkknuralezqmcryvkankszmzpgqutojoyzsnyfwsyeqqzrlhzbc"));
	}
}
