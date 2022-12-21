package edunova03;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj: "));

		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj: "));

		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj: "));

		if(a>b && a>c) {
			System.out.println(a);
		} else if (b>a && b>c) {
			System.out.println(b);
		}else if(c>a && c>b) {
			System.out.println(c);
		}else {
			System.out.println("Brojevi su jednaki");
		}
	}

}
