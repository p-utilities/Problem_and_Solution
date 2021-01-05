package dayThree;

import java.util.Scanner;

/**
 * INFO
 * 
 * Given a matrix C of size N x M. You are given position of submatrix as X1, Y1
 * and X2, Y2 inside the matrix. Find the sum of all elements inside that
 * submatrix.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. The first line of each test case is n and m,n is the number of
 * rows and m is the number of columns. The second line of each test case
 * contains C[N][M]. The third line contains four value of X1, Y1, X2, Y2. X1,
 * Y1 is the top left cell and X2, Y2 is the bottom right cell.
 * 
 * Output: Print the sum of all elements inside that submatrix.
 * 
 * 
 * Example:
 * 
 * Input: 2 5 6 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
 * 25 26 27 28 29 30 3 4 4 5 3 3 9 8 7 4 2 1 6 5 3 1 2 3 3
 * 
 * Output: 78 26
 * 
 * @author Igor Stojanovic
 *
 */
public class AdditionOfSubmatrix {
	private AdditionOfSubmatrix() {
	}

	public static void additionOfSubmatrix() {

		Scanner scan = new Scanner(System.in);
		int repeats = scan.nextInt();
		int[] results = new int[repeats];

		for (int r = 0; r < repeats; r++) {
			int n = scan.nextInt();
			int m = scan.nextInt();

			int[][] matrix = new int[n][m];

			n -= 1;
			m -= 1;

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= m; j++) {
					matrix[i][j] = scan.nextInt();
				}
			}

			int x1 = scan.nextInt() - 1;
			int y1 = scan.nextInt() - 1;
			int x2 = scan.nextInt() - 1;
			int y2 = scan.nextInt() - 1;

			int result = 0;
			for (int i = x1; i <= x2; i++) {
				for (int j = y1; j <= y2; j++) {
					result += matrix[i][j];
				}
			}
			results[r] = result;
		}

		scan.close();

		for (int r : results) {
			System.out.println(r);
		}
	}

	public static void main(String[] args) {
		additionOfSubmatrix();
	}
}
