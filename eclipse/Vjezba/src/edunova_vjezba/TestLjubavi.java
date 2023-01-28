package edunova_vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestLjubavi {

	public static void main(String[] args) {

		String ime1 = JOptionPane.showInputDialog("Unesite prvo ime");
		String ime2 = JOptionPane.showInputDialog("Unesite drugo ime");

	}

	public static int[] prviKorak(String ime1, String ime2) {
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
		int veci = 0, manji = 0;
		if (ime1.length() > ime2.length()) {
			veci = ime1.length();
			manji = ime2.length();
		} else {
			manji = ime1.length();
			veci = ime2.length();
		}

		int meduPolje[] = new int[veci];
		if (veci > manji) {
			for (int i = 0; i < manji; i++) {
				meduPolje[i] = poljeBrojeva[i] + poljeBrojeva[poljeBrojeva.length - i - 1];
			}
			for (int i = 0; i < (veci - manji); i++) {
				meduPolje[manji + i] = poljeBrojeva[manji + i];
			}
		} else {
			for (int i = 0; i < manji; i++) {
				meduPolje[i] = poljeBrojeva[i] + poljeBrojeva[poljeBrojeva.length - i - 1];
			}
			for (int i = 0; i < (veci - manji); i++) {
				meduPolje[manji + i] = poljeBrojeva[manji + i];
			}
		}

		return meduPolje;
	}

	private static int [] kalkulator(int meduPolje[]) {
		boolean test=false;
		int []rjesenje=new int[2];
		do {
			int testPrvi = 0;
			int [] polje = new int[meduPolje.length/2];
			for(int i=0; i< (meduPolje.length)/2 ; i++) {
				if(testPrvi==0) {
					polje[i]=meduPolje[i]+meduPolje[meduPolje.length-1+i];
					testPrvi++;
				}else {
					polje[i]=polje[i]+polje[polje.length-1+i];
				}
				
			}
			
		}while(test==false);
		
		return rjesenje;
	}
}
