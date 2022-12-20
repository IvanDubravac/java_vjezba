package edunova03;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
		int i=Integer.parseInt
				(JOptionPane.showInputDialog("Unesite broj:"));
		
		if(i<10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}
		
	}

}
