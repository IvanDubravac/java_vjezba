package edunova;

public class Predavac extends Osoba {
	private String iban;

	public Predavac() {
		super();
	}

	public Predavac(String ime, String prezime, int status, int broj, String brojUgovora, String iban) {
		super(ime, prezime, status, broj, brojUgovora);
		this.iban = iban;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	

	
	

}
