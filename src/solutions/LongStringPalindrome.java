package solutions;

public class LongStringPalindrome {
	public static boolean isPalindrome(String s) {
		// idemo sa dva pokazivaca, levo i desno
		// nadjemo sledece/prvo slovo sa leve strane
		// nadjemo prethodno/zadnje slovo sa desne strane
		// ako su slova razlicita vratimo false
		// ako nisu nastavljamo

		int leftCounter = 0;
		int rightCounter = s.length() - 1;

		OUTER: while (leftCounter < rightCounter) {
			while (!isLetterOrDigit(s.charAt(leftCounter))) {
				leftCounter++;
				if (leftCounter > rightCounter)
					break OUTER;
			}

			while (!isLetterOrDigit(s.charAt(rightCounter))) {
				rightCounter--;
				if (leftCounter > rightCounter)
					break OUTER;
			}
			if (!(toUpperCase(s.charAt(leftCounter)) == toUpperCase(s.charAt(rightCounter))))
				return false;
			leftCounter++;
			rightCounter--;
		}
		return true;
	}

	public static boolean isLetterOrDigit(char c) {
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
			return true;
		else if (c >= '0' && c <= '9')
			return true;
		return false;
	}

	public static char toUpperCase(char c) {
		if (c >= 97 && c <= 122)
			return (char) (c - 32);
		return c;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}

}
