package edunova03;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Z06 {
	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);

		if (i <= 1 || i >= 999) {
			System.out.println("Greška!");
			return;
		}

		int j = 0;
		if (i % 100 >= 1) {
			j = i / 100;
			System.out.println(j);
		}else if(i%10 >= 1) {
			j=i/10;
			System.out.println(j);
		}else {
			System.out.println(i);
		}
	}
}
