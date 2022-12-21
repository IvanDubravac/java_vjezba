package edunova04;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj: "));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj: "));
		
		int min;
		int max;
		if(broj1<broj2) {
			min=broj1;
			max=broj2;
		}else {
			min=broj2;
			max=broj1;
		}
	
		int zbroj = 0;
		for (int i = min; i <=max; i++) {
			if (i % 2 == 0) {
			zbroj+=i;	
			}
		}
		System.out.println(zbroj);
	}
}
