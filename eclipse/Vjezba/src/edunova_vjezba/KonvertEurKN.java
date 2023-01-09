package edunova_vjezba;

import javax.swing.JOptionPane;

public class KonvertEurKN {
	public static void main(String[] args) {
		double tecaj = 7.53450;
		int vrsta = Integer.parseInt(JOptionPane.showInputDialog("Želite li: 1. EUR->KN ili 2. KN->EUR"));
		if (vrsta == 1) {
			double iznos = Double
					.parseDouble(JOptionPane.showInputDialog("Unesite iznos EUR koji želite pretvoriti u KN"));
			System.out.println(iznos * tecaj + " KN");
		} else if (vrsta == 2) {
			double iznos = Double
					.parseDouble(JOptionPane.showInputDialog("Unesite iznos KN koji želite pretvoriti u EUR"));
			System.out.println(iznos / tecaj + " EUR");
		}

	}

}
