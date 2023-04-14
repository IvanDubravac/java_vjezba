/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marko
 */
@Entity
public class Proizvod extends Entitet {

    private String naziv;
    private BigDecimal cijena;
    private BigDecimal netoKolicina;
      @OneToMany(mappedBy = "proizvod")
    private List<Promet> prometi;

    public Proizvod() {
        super();
    }

    public Proizvod(String naziv, BigDecimal cijena, Date rokTrajanja, String zemljaPodrijetla, BigDecimal netoKolicina, int sifra) {
        super(sifra);
        this.naziv = naziv;
        this.cijena = cijena;
        
        this.netoKolicina = netoKolicina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

  

    public BigDecimal getNetoKolicina() {
        return netoKolicina;
    }

    public void setNetoKolicina(BigDecimal netoKolicina) {
        this.netoKolicina = netoKolicina;
    }

    @Override
    public String toString() {
        return naziv;
    }

    public List<Promet> getPrometi() {
        return prometi;
    }

    public void setPrometi(List<Promet> prometi) {
        this.prometi = prometi;
    }
    
    
    
    

}