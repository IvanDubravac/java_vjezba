package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		int broj1= Integer.parseInt
				(JOptionPane.showInputDialog("Unesite broj kojega djelite: "));
		
		int broj2= Integer.parseInt
				(JOptionPane.showInputDialog("Unesit broj s kojime djelite: "));
		
		float rezultat=(float)broj1/broj2;
		
		System.out.println(rezultat);
	}
}
