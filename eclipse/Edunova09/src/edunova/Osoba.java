package edunova;

public class Osoba {

	private String ime;
	private String prezime;
	protected int status;
	int broj;
	protected String brojUgovora;

	public Osoba(String ime, String prezime, int status, int broj, String brojUgovora) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.status = status;
		this.broj = broj;
		this.brojUgovora = brojUgovora;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}

	public Osoba() {
		super();
	}

	public String pozdravi() {
		return ime + " " + prezime;
	}
}
