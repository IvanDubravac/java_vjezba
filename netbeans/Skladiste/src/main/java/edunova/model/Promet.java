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
    @ManyToMany
    private List<Proizvod> proizvodi;
    private BigDecimal kolicina;
    private Date vrijeme;
    @ManyToOne
    private Zaposlenik zaposlenik;
    @ManyToOne
    private Vrsta vrsta;
    
    public Promet(){
    super();
    }

    public Promet(Proizvod proizvod, BigDecimal kolicina, Date vrijeme, Zaposlenik zaposlenik, Vrsta vrsta, int sifra) {
        super(sifra);
        this.proizvodi = proizvodi;
        this.kolicina = kolicina;
        this.vrijeme = vrijeme;
        this.zaposlenik = zaposlenik;
        this.vrsta = vrsta;
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
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

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(Vrsta vrsta) {
        this.vrsta = vrsta;
    }
    
    
    
    
}
