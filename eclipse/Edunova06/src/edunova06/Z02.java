package edunova06;

import javax.swing.JOptionPane;

public class Z02 {

	public static int broj() {
		int i;
		while (true) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj između 1 i 10 :"));
			if (i >= 1 && i <= 10) {
				return i;
			}
		}
		

	}

}
