package edunova_vjezba;

import javax.swing.JOptionPane;

public class Z33 {
	public static void main(String[] args) {

		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		int min, max;
		boolean prim;
		if (broj1 < broj2) {
			min = broj1;
			max = broj2;
		} else {
			min = broj2;
			max = broj1;
		}
		

		for (int i = min; i < max; i++) {
			prim=true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prim=false;
					
				}

			}
			if (prim) {
				System.out.println(i);
			}

		}
	}
}
