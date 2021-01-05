package dayThree;

import java.util.Scanner;

/**
 * 
 * Given an array of penalties P, an array of car numbers C, and also the date
 * D. The task is to find the total fine which will be collected on the given
 * date. Fine is collected from odd-numbered cars on even dates and vice versa.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. Then T test cases follow. Each test case consists of three lines
 * of input. First line of each test case contains two integers N & D, second
 * line contains N space separated car numbers C and third line contains N space
 * separated penalties P.
 * 
 * Output: For each test case,In new line print the total fine.
 * 
 * @author Irina Stojanovic
 *
 */
public class FindTheFine {
	private FindTheFine() {
	}

	public static void findTheFine() {
		Scanner scan = new Scanner(System.in);
		int repeats = scan.nextInt();

		for (int r = 0; r < repeats; r++) {
			int n = scan.nextInt();
			int date = scan.nextInt() % 2;
			int[] carNumbers = new int[n];
			int result = 0;

			for (int i = 0; i < n; i++) {
				carNumbers[i] = scan.nextInt();
			}

			for (int i = 0; i < n; i++) {
				if (date == 0 & carNumbers[i] % 2 != 0) {
					result += scan.nextInt();
				} else if (date != 0 && carNumbers[i] % 2 == 0) {
					result += scan.nextInt();
				} else {
					scan.nextInt();
				}
			}

			System.out.println(result);
		}

		scan.close();
	}

	public static void main(String[] args) {
		findTheFine();
	}
}
