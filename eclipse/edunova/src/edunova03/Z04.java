package edunova03;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj: "));

		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj: "));

		if (i > j) {
			System.out.println(i);
		} else if (i == j) {
			System.out.println("Brojevi su jednaki");
		} else {
			System.out.println(j);
		}

		
	}

}
