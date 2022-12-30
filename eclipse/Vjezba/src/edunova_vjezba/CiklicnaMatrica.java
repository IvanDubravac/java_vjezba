package edunova_vjezba;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		int matrica[][] = new int[redak][stupac];
		int zadnji=0;
		for (int a = 1; a <= stupac; a++) {
			matrica[redak - 1][stupac - a] = a;
			zadnji=a;

		}
		for (int i = redak-1; i >=0; i--) {
				matrica[i][0] = zadnji++;
		}
		for (int i = 0; i < redak; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + " ");

			}
			System.out.println();
		}

	}

}
