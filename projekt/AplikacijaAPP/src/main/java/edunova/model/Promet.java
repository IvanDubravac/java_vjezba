/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marko
 */
@Entity
public class Promet extends Entitet {
    @ManyToOne
    private Proizvod proizvod;
    private BigDecimal kolicina;
    private Date vrijeme;
    @ManyToOne
    private Operater operater;
    @ManyToOne
    private Vrsta vrsta;

    public Promet() {
    super();
    }

    public Promet(Proizvod proizvod, BigDecimal kolicina, Date vrijeme, Operater operater, Vrsta vrsta) {
        this.proizvod = proizvod;
        this.kolicina = kolicina;
        this.vrijeme = vrijeme;
        this.operater = operater;
        this.vrsta = vrsta;
    }

    public Promet(Proizvod proizvod, BigDecimal kolicina, Date vrijeme, Operater operater, Vrsta vrsta, int sifra) {
        super(sifra);
        this.proizvod = proizvod;
        this.kolicina = kolicina;
        this.vrijeme = vrijeme;
        this.operater = operater;
        this.vrsta = vrsta;
    }
    
    
    
    

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }

    public Date getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Date vrijeme) {
        this.vrijeme = vrijeme;
    }

    public Operater getOperater() {
        return operater;
    }

    public void setOperater(Operater operater) {
        this.operater = operater;
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(Vrsta vrsta) {
        this.vrsta = vrsta;
    }
    
  
    
    
    
}