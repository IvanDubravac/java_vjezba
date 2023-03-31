package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Smjer extends Entitet {

	private String naziv;
	private int trajanje;
	private BigDecimal cijena;
	private BigDecimal upisnina;
	private boolean certificiran;
        
        @OneToMany(mappedBy = "smjer")
        private List<Grupa> grupe;
	
	
	public Smjer() {
		super();
	}
	

	public Smjer(int sifra, String naziv, int trajanje, BigDecimal cijena, BigDecimal upisnina, boolean certificiran) {
		super(sifra);
		this.naziv = naziv;
		this.trajanje = trajanje;
		this.cijena = cijena;
		this.upisnina = upisnina;
		this.certificiran = certificiran;
	}




	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	public BigDecimal getUpisnina() {
		return upisnina;
	}
	public void setUpisnina(BigDecimal upisnina) {
		this.upisnina = upisnina;
	}
	public boolean isCertificiran() {
		return certificiran;
	}
	public void setCertificiran(boolean certificiran) {
		this.certificiran = certificiran;
	}

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }
        
        
	
	@Override
	public String toString() {
		return naziv;
	}
	
	
}