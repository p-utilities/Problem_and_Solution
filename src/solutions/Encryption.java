package solutions;

public class Encryption {
	private Encryption() {
	}

	public static String encrypt(String s) {
		s = cleanString(s);
		int numOfRows = (int) Math.sqrt(s.length());
		int numOfColums = numOfColums(numOfRows, s.length());

		return buildEncryption(s, numOfRows, numOfColums);
	}

	private static String cleanString(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				builder.append(c);
			}
		}

		return builder.toString();
	}

	private static int numOfColums(int numOfRows, int stringSize) {
		int numOfColums = numOfRows;
		int difference = Math.abs(stringSize - numOfRows * numOfRows);

		if (Math.abs(stringSize - numOfRows * (numOfRows + 1)) < difference)
			numOfColums = numOfRows + 1;
		if (Math.abs(stringSize - numOfRows * (numOfRows - 1)) < difference)
			numOfColums = numOfRows - 1;

		return numOfColums;
	}

	private static String buildEncryption(String s, int numOfRows, int numOfColums) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < numOfColums; i++) {
			for (int j = 0; j < numOfRows; j++) {
				if (j * numOfColums + i < s.length())
					builder.append(s.charAt(j * numOfColums + i));
			}
		}
		
		return builder.toString();
	}

	public static void main(String[] args) {
		String s = "if man was meant to stay on the ground god would have given us roots";
		s = "abcdefgpm";
		System.out.println(encrypt(s));
	}
}
