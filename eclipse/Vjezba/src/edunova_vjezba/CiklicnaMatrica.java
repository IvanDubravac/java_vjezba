package edunova_vjezba;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka "));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));

		int minR = 0;
		int maxR = redak - 1;
		int minS = 0;
		int maxS = stupac - 1;
		int br = 1;

		int matrica[][] = new int[redak][stupac];

		while (true) {
			if (minS > maxS) {
				break;
			}

			for (int i = maxS; i >= minS; i--) {
				matrica[maxR][i] = br++;
			}
			maxR--;

			if (minR > maxR) {
				break;
			}

			for (int i = maxR; i >= minR; i--) {
				matrica[i][minS] = br++;
			}
			minS++;

			if (minS > maxS) {
				break;
			}

			for (int i = minS; i <= maxS; i++) {
				matrica[minR][i] = br++;
			}
			minR++;

			if (minR > maxR) {
				break;
			}

			for (int i = minR; i <= maxR; i++) {
				matrica[i][maxS] = br++;

			}
			maxS--;
		}

		for (int i = 0; i < redak; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
