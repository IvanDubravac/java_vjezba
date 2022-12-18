package edunova;

import javax.swing.JOptionPane;

public class E06StringKlasa {

	public static void main(String[] args) {
		
	/*	String ime= "Edunova";
		int i= 2022;
		
		System.out.println(ime + " " + i);
	*/
		String ime1 = JOptionPane.showInputDialog("Unesite svoje ime:");
		String ime2= JOptionPane.showInputDialog("Unesite ime svoje simpatije: ");
		
		int ljubav=(int)(Math.random()*100);
		
		System.out.println(ime1 + " i " + ime2 + " se vole " + ljubav + " % ! ");
	}

}
