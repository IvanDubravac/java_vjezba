package edunovaa07;

import javax.swing.JOptionPane;

public class E01_TryCatch {

	public static void main(String[] args) {

		int i = 0;
		String broj = "";
		while (true) {
			try {
				broj = JOptionPane.showInputDialog("Daj broj");
				i = Integer.parseInt(broj);
				break;
			} catch (Exception e) {

				if (broj.length() >= 9) {

					JOptionPane.showMessageDialog(null, "Unijeli ste preveliki/premali broj");
			
				}
			}
		}
		System.out.println(i);

	}

}
