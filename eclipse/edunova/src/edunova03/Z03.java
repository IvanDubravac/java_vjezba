package edunova03;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		
		int i=Integer.parseInt
				(JOptionPane.showInputDialog("Unesite broj: "));
		
		int j=Integer.parseInt
				(JOptionPane.showInputDialog("Unesite broj: "));
				
		if(i+j>10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
			
		}
	}

}
