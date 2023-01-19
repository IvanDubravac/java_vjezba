package edunova08;

public class E02_Start {
	public static void main(String[] args) {
		
		Osoba osoba=new Osoba();
		osoba.setIme(Pomocno.obavezanUnosStringa("Unesite ime"));
		osoba.setPrezime("Perić");
		osoba.setGodine(22);
		
//		System.out.println(osoba.getIme());
//		System.out.println(osoba.getPrezime());
//		System.out.println(osoba.getGodine());
		Osoba osobe[]=new Osoba[3];
		osobe[0]=osoba;
		osobe[1]=kreirajOsobu("Pero", "Nikić", 22);
		osobe[2]=kreirajOsobu("Ivan", "Dubravac", 98);
		
		for(Osoba o: osobe) {
		System.out.println(o.getPrezime());
		}
		
		
		
		
		
		
	}
	
	private static Osoba kreirajOsobu(String ime, String prezime, int godine){
		Osoba osoba=new Osoba();
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		osoba.setGodine(godine);
		
		return osoba;
			
	
	}
	
}
