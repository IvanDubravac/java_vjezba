package edunova03;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		int i= Integer.parseInt
				(JOptionPane.showInputDialog("Unesite broj"));
		
		if(i%2==0) {
			System.out.println("Broj je paran.");
			
		}else {
			System.out.println("Broj je neparan.");
		}
	}

}
