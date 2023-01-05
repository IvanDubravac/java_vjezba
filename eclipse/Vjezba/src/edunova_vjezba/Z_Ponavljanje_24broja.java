package edunova_vjezba;

import javax.swing.JOptionPane;

public class Z_Ponavljanje_24broja {
	public static void main(String[] args) {
		int polje[] = new int[24];
		int najmanji = 0;
		int najveci = 0;
		int zbroj = 0;
		for (int i = 0; i < 3; i++) {
			int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite" + " " + (i + 1) + ". " + "broj"));
			polje[i] = broj;
			zbroj += broj;
			najmanji = polje[0];
			najveci = polje[0];

			if (polje[i] < polje[i + 1]) {
				najmanji = polje[i];
			}

			if (polje[i] > polje[i + 1]) {
				najveci = polje[i];

			}
		}
		System.out.println(zbroj);
		System.out.println(najmanji);
		System.out.println(najveci);
	}

}
