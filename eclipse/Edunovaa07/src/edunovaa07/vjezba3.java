package edunovaa07;

public class vjezba3 {
	public static void main(String[] args) {
		
		String ime1=metode1.unosImena("Unesite svoje ime");
		String ime2=metode1.unosImena("Unesi ime svoje simpatije");
		
		int slucajnibroj=metode1.slucajniBroj(10, 90);
		
		System.out.println(ime1+ " i "+ime2 +" se vole "+ slucajnibroj+"%.");
	}

}
