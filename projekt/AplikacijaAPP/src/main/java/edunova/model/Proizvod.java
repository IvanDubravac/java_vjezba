/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author marko
 */
@Entity
public class Proizvod extends Entitet {

    private String naziv;
    private BigDecimal cijena;
    private Date rokTrajanja;
    private String zemljaPodrijetla;
    private BigDecimal netoKolicina;

    public Proizvod() {
        super();
    }

    public Proizvod(String naziv, BigDecimal cijena, Date rokTrajanja, String zemljaPodrijetla, BigDecimal netoKolicina, int sifra) {
        super(sifra);
        this.naziv = naziv;
        this.cijena = cijena;
        this.rokTrajanja = rokTrajanja;
        this.zemljaPodrijetla = zemljaPodrijetla;
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

    public Date getRokTrajanja() {
        return rokTrajanja;
    }

    public void setRokTrajanja(Date rokTrajanja) {
        this.rokTrajanja = rokTrajanja;
    }

    public String getZemljaPodrijetla() {
        return zemljaPodrijetla;
    }

    public void setZemljaPodrijetla(String zemljaPodrijetla) {
        this.zemljaPodrijetla = zemljaPodrijetla;
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
    
    

}