package solutions;

public class DecodeWays {
	public static int numDecodings(String s) {
		int result = 1;
		int counter = 1;
		int previousCounter = 0;
		int startIndex = 0;
		while (startIndex < s.length() && s.charAt(startIndex) - 48 == 0)
			startIndex++;

		for (int i = startIndex; i < s.length(); i++) {
			if (s.charAt(i) - 48 <= 2 && s.charAt(i) - 48 > 0) {
				int helper = counter;
				counter += previousCounter;
				previousCounter = helper;

			} else if (counter > 0) {
				if (s.charAt(i) - 48 == 0) {
					if (s.charAt(i - 1) - 48 == 0) {
						result = 0;
						break;
					}
					if (counter > 1) {
						counter = previousCounter;
					}
					System.out.println("nesto");
				} else if (s.charAt(i) - 48 <= 6) {
					System.out.println(counter);
					int helper = counter;
					counter += previousCounter;
					previousCounter = helper;
				}
				System.out.println(counter);
				result *= counter;
				counter = 1;
				previousCounter = 0;
				System.out.println(result);
			}
		}

		if (counter > 0)
			result *=counter;

		if (result == 1 && ((s.length() - startIndex == 1 && s.charAt(0) - 48 == 0) || s.length() - startIndex == 0))
			result = 0;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(numDecodings("12"));
	}

}
