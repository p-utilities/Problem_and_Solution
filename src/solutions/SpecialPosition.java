package solutions;

import java.util.ArrayList;

/**
 * <b>Problem :</b> 
 */
public class SpecialPosition {
	public static int numSpecial(int[][] mat) {
		int result = 0;
		var onesI = new ArrayList<Integer>();
		var onesJ = new ArrayList<Integer>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) {
					if (onesI.contains(i)) {
						if(result != 0)
							result--;
						if(!onesJ.contains(j))
							onesJ.add(j);
						continue;
					}
					if (onesJ.contains(j)) {
						onesI.add(i);
						if(result != 0)
							result--;
						continue;
					}
					onesI.add(i);
					onesJ.add(j);
					result++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] s = new int[2][3];
		s[0][0] = 0;
		s[0][1] = 0;
		s[1][0] = 0;
		s[1][1] = 0;
		s[2][0] = 1;
		s[2][1] = 0;
		System.out.println(numSpecial(s));
	}
}
