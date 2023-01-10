package edunova05;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {
		double umnozak = 1;
		double broj;
		int i=0;
		while(i<5) {
			broj=Double.parseDouble(JOptionPane.showInputDialog("Unesite"+" "+(i+1)+". broj"));
			i++;
			
			if(broj>=2 && broj<=4) {
				umnozak*=broj;
			}else {
				System.out.println("Broj treba biti između 2 i 4");
				break;
			}
	
	
			
		}
System.out.println(umnozak);
	}

}
