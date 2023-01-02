package edunova_vjezba;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		int matrica[][] = new int[redak][stupac];
		int zadnji = 1;
			
		for (int q = 1; q <= stupac; q++) {
			matrica[redak - 1][stupac - q] = q;
			zadnji = q;
		}

		for (int i = redak - 1; i >= 0; i--) {
			matrica[i][0] = zadnji++;

		}

		for (int a = 1; a < stupac; a++) {
			matrica[0][a] = zadnji++;
		}
			
		for (int i = 1; i < redak - 1; i++) {
			matrica[i][stupac - 1] = zadnji++;
		}

		for (int i = 0; i < redak; i++) {
			for (int j = 0; j < stupac; j++) {
				if (matrica[i][j] >= 10) {
					System.out.print(matrica[i][j] + " ");
				} else {
					System.out.print(" " + matrica[i][j] + " ");
				}

			}

			System.out.println();
		}

	}

}
