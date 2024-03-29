package edunova.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grupa extends Entitet {
	private String naziv;
	private Smjer smjer;
	private Predavac predavac;
	private Date datumPocetka;
	private List<Polaznik> polaznici;

	public Grupa() {
		super();
		polaznici = new ArrayList<>();
	}

	public Grupa(int sifra, String naziv, Smjer smjer, Predavac predavac, Date datumPocetka, List<Polaznik> polaznici) {
		super(sifra);
		this.naziv = naziv;
		this.smjer = smjer;
		this.predavac = predavac;
		this.datumPocetka = datumPocetka;
		this.polaznici = polaznici;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Smjer getSmjer() {
		return smjer;
	}

	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}

	public Predavac getPredavac() {
		return predavac;
	}

	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}

	public Date getDatumPocetka() {
		return datumPocetka;
	}

	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}

	public List<Polaznik> getPolaznici() {
		return polaznici;
	}

	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}

}
