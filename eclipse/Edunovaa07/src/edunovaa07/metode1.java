package edunovaa07;

import javax.swing.JOptionPane;

public class metode1 {

	public static int ucitajCijeliBroj(String poruka, String upozorenje) {

		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, upozorenje);
			}

		}

	}

	public static int ucitajCijeliBroj(String poruka) {
		return ucitajCijeliBroj(poruka, "Pogreška pri unosu, unesite cijeli broj:");
	}

	public static int ucitajCijeliPozitivniBroj(String poruka) {
		int i = ucitajCijeliBroj(poruka);
		while (true) {
			if (i > 0) {
				return i;
			} else {
				JOptionPane.showMessageDialog(null, "Broj mora biti veći od 0");
				i = ucitajCijeliBroj(poruka);
			}
		}

	}

	public static int ucitajCijeliBrojURasponu(String poruka, int odBroja, int doBroja) {
			int i=ucitajCijeliBroj(poruka);
			while(true) {
				if(i>=odBroja && i<=doBroja) {
					return i;
				}else {
					JOptionPane.showMessageDialog(null, "Broj mora biti između 0 i 6");
					i=ucitajCijeliBroj(poruka);
				}
			}
		
		
		
	}

}
