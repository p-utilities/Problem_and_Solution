package daySix;

import java.util.LinkedList;

public class QeensAttackII {
	public static int getPossibleAttacks(int n, int m, int[] qeenPossition, int[] obsticles) {
		LinkedList<Integer> maxPoss = getMaximumAttacks(n, qeenPossition);
		System.out.println(maxPoss.size());
		for (int i = 0; i < m; i++) {
			if (maxPoss.contains(obsticles[i * 2] * 10 + obsticles[i * 2 + 1]))
				maxPoss.remove(i);
		}

		return maxPoss.size();
	}

	private static LinkedList<Integer> getMaximumAttacks(int n, int[] qeenPossition) {
		LinkedList<Integer> attackPoss = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (qeenPossition[0] != i) {
				int pos = i * 10 + qeenPossition[1];
				System.out.println(pos);
				attackPoss.add(pos);
			}
		}

		for (int i = 1; i <= n; i++) {
			if (qeenPossition[1] != i) {
				int pos = qeenPossition[0] * 10 + i;
				System.out.println(pos);
				attackPoss.add(pos);
			}
		}

		for (int i = 1; i <= n; i++) {
			if (qeenPossition[0] != i) {
				int px = qeenPossition[1] + qeenPossition[0] - i;
				int py = qeenPossition[1] - qeenPossition[0] + i;
				if (px >= 1 && px <= n) {
					attackPoss.add(i * 10 + px);

				}
				if (py >= 1 && py <= n) {
					attackPoss.add(i * 10 + py);
				}
			}
		}

		return attackPoss;
	}

	public static void main(String[] args) {
		System.out.println(getPossibleAttacks(5, 3, new int[] { 4, 3 }, new int[] { 5, 5, 4, 2, 2, 3 }));
	}
}
