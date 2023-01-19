package edunova08;

import java.util.Date;

public class E02_Start {
	public static void main(String[] args) {
		
//		Osoba osoba=new Osoba();
//		osoba.setIme(Pomocno.obavezanUnosStringa("Unesite ime"));
//		osoba.setPrezime("Perić");
//		osoba.setGodine(22);
//		
////		System.out.println(osoba.getIme());
////		System.out.println(osoba.getPrezime());
////		System.out.println(osoba.getGodine());
//		Osoba osobe[]=new Osoba[3];
//		osobe[0]=osoba;
//		osobe[1]=kreirajOsobu("Pero", "Nikić", 22);
//		osobe[2]=kreirajOsobu("Ivan", "Dubravac", 98);
//		
//		for(Osoba o: osobe) {
//		System.out.println(o.getPrezime());
//		}
//		
		
//		Mjesto mjesto=new Mjesto();
//		Zupanija zupanija=new Zupanija();
//		zupanija.setNaziv("OBŽ");
//		mjesto.setZupanija(zupanija);
//		System.out.println(mjesto.getZupanija().getNaziv());
		
//		
//		Grupa jp27=kreirajGrupu(1, "JP27", 20, new Date(), kreirajSmjer(1, "Java programiranje", 5999.99f, 500, true));
//		Grupa pp26= kreirajGrupu(2, "PP26", 20, new Date(), kreirajSmjer(1, "PHP programiranje", 4999.99f, 500, false));
//		
//		System.out.println(jp27.getNaziv());
//		System.out.println(pp26.getNaziv());
//		System.out.println(jp27.getSmjer().getCijena()+pp26.getSmjer().getCijena());
		
	
		Racunalo r1=kreirajRacunalo("Dobro racunalo", 1999999.99, false, 200, 2.6f);
		Racunalo r2=kreirajRacunalo("Loše racunalo", 2000, true, 50, 1.6f);
		
		System.out.println(r1.getCijena());
		
		Racunalo [] racunala=new Racunalo[2];
		racunala[0]=r1;
		racunala[1]=r2;
		
		System.out.println(racunala[0]);
		
		
		
		
	}
	
	private static Osoba kreirajOsobu(String ime, String prezime, int godine){
		Osoba osoba=new Osoba();
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		osoba.setGodine(godine);
		
		return osoba;
			
	
	}
	
	private static Smjer kreirajSmjer(int sifra, String naziv, float cijena, float upisnina, boolean certificiran) {
		Smjer s=new Smjer();
		s.setSifra(sifra);
		s.setNaziv(naziv);
		s.setCijena(cijena);
		s.setUpisnina(upisnina);
		s.setCertificiran(certificiran);
		
		return s;
		
	}
	
	private static Grupa kreirajGrupu(int sifra, String naziv, int maksimalnoPolaznika, Date datumPocetka, Smjer smjer) {
		Grupa g=new Grupa();
		g.setSifra(sifra);
		g.setNaziv(naziv);
		g.setMaksimalnoPolaznika(maksimalnoPolaznika);
		g.setDatumPocetka(datumPocetka);
		g.setSmjer(smjer);
		
		return g;
	
	}
	
	private static Racunalo kreirajRacunalo(String ime, double cijena, boolean ukraden, int cijenaMisa, float herci) {
		Racunalo r=new Racunalo();
		r.setIme(ime);
		r.setCijena(cijenaMisa);
		r.setUkraden(ukraden);
		r.setCijenaMisa(cijenaMisa);
		r.setHerci(herci);
		
		return r;
		
	}
	
}
