package edunova_vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TEST {
	public static void main(String[] args) {

		String ime1 = JOptionPane.showInputDialog("Unesite prvo ime");
		String ime2 = JOptionPane.showInputDialog("Unesite drugo ime");

		int brojac;
		String zbrojImena = ime1 + ime2;
		char slovaUPolju[] = (zbrojImena.toUpperCase().toCharArray());
		int poljeBrojeva[] = new int[zbrojImena.length()];

		for (int i = 0; i < zbrojImena.length(); i++) {
			brojac = 0;
			for (int j = 0; j < zbrojImena.length(); j++) {
				if (slovaUPolju[i] == slovaUPolju[j]) {
					brojac++;
				}
			}
			poljeBrojeva[i] = brojac;
		}

		System.out.println(Arrays.toString(poljeBrojeva));

	}

}
