/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Proizvod {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer sifra;
   private String naziv;
   private BigDecimal cijena;
   private Date rokTrajanja;
   private String zemljaPodrijetla;
   private BigDecimal netoKolicina;

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
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
   
   
    
    
}
