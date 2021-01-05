package solutions;

public class DivideTwoNumbers {

	private DivideTwoNumbers() {

	}

	public static double divide(int numberOne, int numberTwo, int numberOfDecimals) {
		double result = 0;
		int firstNumber = numberOne;
		if (numberTwo == 0) {
			throw new ArithmeticException();
		}

		while(firstNumber >= numberTwo) {
			result += 1;
			firstNumber -= numberTwo;
		}

		System.out.println(firstNumber + " firstNumber");
		for (int i = 1; i <= numberOfDecimals; i++) {
			double helper = firstNumber;
			for(int j = 0; j<9; j++) {
				firstNumber += helper;
			}
			
			double decimal = 1.0 / Math.pow(10, i);
			
			while(firstNumber >= numberTwo) {
				result += decimal;
				firstNumber -= numberTwo;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] firstNumbers = new int[] { 5, 20, 6, 3, 99, 2, 120 };
		int[] secondNumbers = new int[] { 7, 15, 7, 5, 2, 9, 12 };

		for (int i = 0; i <= 6; i++) {
			System.out.println(
					firstNumbers[i] + " / " + secondNumbers[i] + " = " + divide(firstNumbers[i], secondNumbers[i], 0));
		}
	}
}
