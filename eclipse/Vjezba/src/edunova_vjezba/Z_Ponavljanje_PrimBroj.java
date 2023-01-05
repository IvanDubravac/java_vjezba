package edunova_vjezba;

import javax.swing.JOptionPane;

public class Z_Ponavljanje_PrimBroj {
	public static void main(String[] args) {

		int brojac = 0;
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj:"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj:"));
		int min, max;
		if (broj1 < broj2) {
			min=broj1;
			max=broj2;
		} else {
			min=broj2;
			max=broj1;
		}

		for (int i = min; i < max; i++) {
			brojac = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					brojac++;
				}
			}
			if (brojac == 0) {
				System.out.println(i);
			}

		}
	}

}
