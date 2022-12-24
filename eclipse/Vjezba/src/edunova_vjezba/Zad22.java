package edunova_vjezba;

public class Zad22 {
	public static void main(String[] args) {
		
		int tm[][]=new int[20][20];
		
		for(int i=1; i<=15; i++) {
			for(int j=1;j<=15;j++) {
				tm[i][j]= i*j;
				
				if(tm[i][j]>=10 && tm[i][j]<100 ) {
				
				System.out.print( tm[i][j]+ "       " );
				}else if(tm[i][j]>=100 && tm[i][j]<300) {
					System.out.print( tm[i][j]+ "      " );
				}else 
					System.out.print(" "+ tm[i][j]+"       ");
			}
			System.out.println();
		}
		
	}

}
