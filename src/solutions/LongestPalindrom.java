package solutions;

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
		System.out.println(longestPalindrome("azwdzwmwcqzgcobeeiphemqbjtxzwkhiqpbrprocbppbxrnsxnwgikiaqutwpftbiinlnpyqstkiqzbggcsdzzjbrkfmhgtnbujzszxsycmvipjtktpebaafycngqasbbhxaeawwmkjcziybxowkaibqnndcjbsoehtamhspnidjylyisiaewmypfyiqtwlmejkpzlieolfdjnxntonnzfgcqlcfpoxcwqctalwrgwhvqvtrpwemxhirpgizjffqgntsmvzldpjfijdncexbwtxnmbnoykxshkqbounzrewkpqjxocvaufnhunsmsazgibxedtopnccriwcfzeomsrrangufkjfzipkmwfbmkarnyyrgdsooosgqlkzvorrrsaveuoxjeajvbdpgxlcrtqomliphnlehgrzgwujogxteyulphhuhwyoyvcxqatfkboahfqhjgujcaapoyqtsdqfwnijlkknuralezqmcryvkankszmzpgqutojoyzsnyfwsyeqqzrlhzbc"));
	}
}
