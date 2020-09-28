package solutions;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		int remainder = 0;
		int counter = digits.length - 1;
		
		if (counter == -1) {
			digits = new int[] {0};
			counter = digits.length - 1;
		}
		
		do {
			remainder += digits[counter];
			if (digits.length - 1 == counter)
				remainder++;
			digits[counter] = remainder % 10;
			remainder /= 10;
			counter--;
		} while (remainder > 0 && counter >= 0);
		
		
		if (remainder > 0) {
			int[] newArray = new int[digits.length + 1];
			newArray[0] = remainder;
			for (int i = 1; i < digits.length; i++) {
				newArray[i] = digits[i - 1];
			}
			digits = newArray;
		}

		return digits;
	}

	public static void main(String[] args) {
		int[] s = plusOne(new int[] {9});
		for(int p : s) {
			System.out.print(p);
		}
	}
}
