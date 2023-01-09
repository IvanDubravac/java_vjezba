package edunova05;

import javax.swing.JOptionPane;

public class NovePetlje {
	
	public static void main(String[] args) {
		
//		while(true) {
//			break;
//		}
//		
//		boolean uvjet=false;
//		while(uvjet) {
//			System.out.println("Osijek");
//		}
//		
//		int broj=0;
//		while(broj<10) {
//			System.out.println(broj++);
//			if(broj==8) {
//				break;
//			}
//		}
	
		int b=0;
		while(true) {
			b=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj između 1 i 10"));
			if(b>=1 && b<=10) {
				break;
			}
			
		}
		
		System.out.println(b);
		
	}

}
