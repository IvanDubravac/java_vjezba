package edunova_vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestLjubavi {

	public static void main(String[] args) {

		String ime1 = JOptionPane.showInputDialog("Unesite prvo ime");
		String ime2 = JOptionPane.showInputDialog("Unesite drugo ime");

	}

	public static int[] BrojacSlova(String ime1, String ime2) {
		int brojac;
		String zbrojImena = ime1 + ime2;
		char slovaUPolju[] = (zbrojImena.toUpperCase().toCharArray());
		int poljeBrojeva[] = new int[zbrojImena.length()];

		for (int i = 0; i < (zbrojImena.length()); i++) {
			brojac = 0;
			for (int j = 0; j < (zbrojImena.length()); j++) {
				if (slovaUPolju[i] == slovaUPolju[j]) {
					brojac++;
				}
			}
			poljeBrojeva[i] = brojac;
		}
		int meduPolje[] = new int[ime2.length()];
		if (ime1.length() > ime2.length()) {
			for (int i = 0; i < ime2.length(); i++) {
				meduPolje[i] = poljeBrojeva[i] + poljeBrojeva[poljeBrojeva.length - i - 1];
			}
			for (int i = 0; i < ( ime1.length() - ime2.length()); i++) {
				meduPolje[ime2.length() + i] = poljeBrojeva[ime2.length() + i];
			}
		} else {
			for (int i = 0; i < ime1.length(); i++) {
				meduPolje[i] = poljeBrojeva[i] + poljeBrojeva[poljeBrojeva.length - i - 1];
			}
			for (int i = 0; i < (ime2.length() - ime1.length()); i++) {
				meduPolje[ime1.length() + i] = poljeBrojeva[ime1.length() + i];
			}
		}

	}
}
