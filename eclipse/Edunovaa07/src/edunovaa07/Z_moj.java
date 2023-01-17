package edunovaa07;

import javax.swing.JOptionPane;

public class Z_moj {
	public static void main(String[] args) {

		int i = 0;
		String broj = "";
		while (true) {

			try {
				broj = JOptionPane.showInputDialog("Unesi broj");
				i = Integer.parseInt(broj);

				break;
			} catch (Exception e) {

				if (broj.length() >= 9) {
					JOptionPane.showMessageDialog(null, "Broj je prevelik/premal, unesite ponovno:");

				}

			}

		}
		System.out.println(i);
	}

}
