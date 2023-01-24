package edunova;

public class Polaznik extends Osoba{
	
	private String brojUgovora;

	public Polaznik(String ime, String prezime, int status, int broj, String brojUgovora, String brojUgovora2) {
		super(ime, prezime, status, broj, brojUgovora);
		brojUgovora = brojUgovora2;
	}

	public Polaznik() {
		super();
	}
	
	
	

}
