package dayOne.challenge;

public class DevideNumber {
	private static double result = 0;
	private static int block = 0;
	private static boolean isFound = false;
	private static boolean isDouble = false;

	private DevideNumber() {

	}

	public static double devide(int number) {
		int currentNumber = 0;
		setBlockSize(number);
		do {
			currentNumberCheck(number, currentNumber);
			if (!isFound) {
				if ((currentNumber + block) + (currentNumber + block) <= number) {
					currentNumber = currentNumber + block;
				} else {
					changeBlockSize();
				}
			}
		} while (!isFound);

		if (isDouble) {
			result += 0.5;
		}
		isDouble = false;
		isFound = false;
		return result;
	}

	// possible
	private static void currentNumberCheck(int number, int possibleResult) {
		if (possibleResult + possibleResult == number) {
			result = possibleResult;
			isFound = true;
		} else if (possibleResult + possibleResult + 1 == number) {
			result = possibleResult;
			isFound = true;
			isDouble = true;
		}
	}

	private static void setBlockSize(int number) {
		int numberSize = Integer.toString(number).length();

		if (numberSize <= 2) {
			block = 1;
		} else if (numberSize < 100) {
			block = 50;
		} else {
			block = 100;
		}
	}

	private static void changeBlockSize() {
		if (block == 100) {
			block = 50;
		} else if (block == 50) {
			block = 25;
		} else if (block == 25) {
			block = 5;
		} else {
			block = 1;
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 10, 50, 66, 65, 90, 1526823, 11111 };
		for (int number : numbers) {
			System.out.println("The half is :" + devide(number));
		}
	}
}
