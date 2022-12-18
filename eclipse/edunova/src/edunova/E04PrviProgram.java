package edunova;

import javax.swing.JOptionPane;

public class E04PrviProgram {
	
	public static void main(String[] args) {
		int broj1= Integer.parseInt
				(JOptionPane.showInputDialog("Unesite prvi broj: "));
		
		int broj2= Integer.parseInt
				(JOptionPane.showInputDialog("Unesite drugi broj: "));
		
		
		int rez= broj1+ broj2;
		
		System.out.println(rez); 
	}

}