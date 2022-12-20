package edunova03;

public class E0105 {
	
	public static void main(String[] args) {
	/*
		boolean uvjet=true;
		
		if(uvjet) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
		int i=7;
		if(i<10) {
			System.out.println("3");
		}
		
		
		int j=3;
		
		if(j==7) {
			System.out.println("1");
		}else if(j==5) {
			System.out.println("2");
		}else {
			System.out.println("Ništa");
		}
	*/
		int ocjena=33 ; 
		
		switch(ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Odličan");
			break;
		default: {
			System.out.println("Nije ocjena");
		}
		}
		
		
		
		
		

		
		
	}

}
