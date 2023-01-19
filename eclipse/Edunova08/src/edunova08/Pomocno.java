package edunova08;

import javax.swing.JOptionPane;

public class Pomocno {

	public static int ucitajCijeliBroj(String porukaKorisniku, String obavijestOGresci) {
		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(porukaKorisniku));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, obavijestOGresci);
			}

		}
	}

	public static int ucitajCijeliBroj() {

		return ucitajCijeliBroj("Unesi broj", "Greška kod unosa broja");

	}

	public static int ucitajCijeliBroj(String string) {
		return ucitajCijeliBroj(string, "Greška kod unosa broja.");
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

	public static int ucitajCijeliBrojURasponu(String poruka, int odBroj, int doBroj) {
		int i = ucitajCijeliBroj(poruka);
		while (true) {
			if (i >= odBroj && i <= doBroj) {
				return i;
			} else {
				JOptionPane.showMessageDialog(null, "Broj mora biti veći od 0 i manji od 6");
				i = ucitajCijeliBroj(poruka);
			}

		}

	}

	public static String obavezanUnosStringa(String poruka) {
		String s = "";
		while (s.isEmpty()) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.length() > 0) {
				return s;
			}
		}

		return "";
	}

	public static int slucajniBrojURasponu(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
		
	}
	
	
	

}
