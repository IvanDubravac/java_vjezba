package edunova05;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		
		int najveci=Integer.MIN_VALUE, i=0,broj;
		
		while(i<5) {
			broj=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj:"));
			if(broj>najveci) {
				najveci=broj;
			}
			i++;
		}
		System.out.println(najveci);
	}

}
