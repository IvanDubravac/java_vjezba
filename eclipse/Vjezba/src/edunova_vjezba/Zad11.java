package edunova_vjezba;

import javax.swing.JOptionPane;

public class Zad11 {
	public static void main(String[] args) {
		int polje[] = new int[50];
		int najmanji ;
		int najveci ;
		int zbroj = 0;
		for (int i = 0; i < 24; i++) {
			int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi" + " " + (i + 1) + "." + " broj "));
			polje[i] = broj;
			zbroj = zbroj + polje[i];
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
