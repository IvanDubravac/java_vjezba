package edunova_vjezba;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	public static void main(String[] args) {
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		int matrica[][] = new int[redak][stupac];
		for (int i = 0; i < redak; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + " ");

			}
			
			for(int z=0; z<=redak-1; z++) {
				for (int b = redak + stupac - 1; b <= redak - 1; b--) {
					matrica[redak-z][0]=b;
			}
			}
			for (int a = 1; a <= stupac; a++) {
				matrica[redak - 1][stupac - a] = a;

			}
		
			
			System.out.println();
		}

	}

}
