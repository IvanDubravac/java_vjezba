package edunova03;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Z06 {
	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj: "));

		if (i <= 1 || i >= 999) {
			System.out.println("Greška!");
			return;
		}
		if(i>=100 && i<=999) {
			System.out.println(i/100);
		}else if(i>=10 && i<99) {
			System.out.println(i/10);
		}else {
			System.out.println(i);
		}
	}
}


