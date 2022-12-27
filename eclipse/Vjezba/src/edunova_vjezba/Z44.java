package edunova_vjezba;

import javax.swing.JOptionPane;

public class Z44 {
	public static void main(String[] args) {

		int matrica1[][] = new int[4][4];
		int matrica2[][] = new int[4][4];
		int rezultat[][] = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrica1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Popuni matricu 1"));
				System.out.print(matrica1[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrica2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Popuni matricu 2"));
				System.out.print(matrica1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				rezultat[i][j] = matrica1[i][j] + matrica2[i][j];
				System.out.print(rezultat[i][j] + " ");
			
			}
			System.out.println();
		}

	}
}
