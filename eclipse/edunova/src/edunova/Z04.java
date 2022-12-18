package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj kojemu želite zbrojiti znamenke: "));

		int r = 0, znamenka;

		while (broj > 0) {
			znamenka = broj % 10;
			r = r + znamenka;
			broj = broj / 10;
		}
			System.out.println(r);
	}

}
