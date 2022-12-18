package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite dvoznamenkasti broj: "));

		 int r = i % 10;
		
		System.out.println(r);

	}

}
