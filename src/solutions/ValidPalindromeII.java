package solutions;

public class ValidPalindromeII {
	public static boolean isPalindrome(String s) {
		int leftCounter = 0;
		int rightCounter = s.length() - 1;

		while (leftCounter < rightCounter) {
			if (s.charAt(leftCounter) != s.charAt(rightCounter)) {
				if (isSubPalindrome(s, leftCounter, rightCounter - 1))
					break;
				if (isSubPalindrome(s, leftCounter + 1, rightCounter))
					break;
				return false;

			} else {
				leftCounter++;
				rightCounter--;
			}
		}

		return true;
	}

	public static boolean isSubPalindrome(String s, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			if (s.charAt(startIndex) != s.charAt(endIndex))
				return false;
			startIndex++;
			endIndex--;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("abca"));
	}

}
