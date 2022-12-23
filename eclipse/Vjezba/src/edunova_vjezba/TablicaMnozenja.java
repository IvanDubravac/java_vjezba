package edunova_vjezba;

import java.util.Arrays;

public class TablicaMnozenja {

	public static void main(String[] args) {

		for (int i = 0; i < 31; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");

		for (int i = 0; i < 31; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(" * |  1  2  3  4  5  6  7  8  9");

		for (int i = 0; i < 31; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		
		int polje[][] = new int[10][10]; 
		for (int i = 1; i <= 9; i++) {
			System.out.print(" "+i + " "+ "|");
			for (int j = 1; j <= 9; j++) {
				
				polje[i][j] = i * j;{
					
					if(polje[i][j]>=10) {
						System.out.print(" "+ polje[i][j]);
					}else
						
			
				System.out.print("  "+ polje[i][j]);
		
				
				
				}
		}
			
			System.out.println();
		}
		

		
		for (int i = 0; i < 31; i++) {
			System.out.print("-");
			
		}
		System.out.println();
		System.out.println(":   :   :   :   :     : by Ivan");
		
		for (int i = 0; i < 31; i++) {
			System.out.print("-");
	}
	}
}
