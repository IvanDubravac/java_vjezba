/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;

/**
 *
 * @author marko
 */
@Entity
public class Vrsta extends Entitet {

    private String naziv;
    private int predznak;

    public Vrsta() {
        super();
    }

    public Vrsta(String naziv, int predznak, int sifra) {
        super(sifra);
        this.naziv = naziv;
        this.predznak = predznak;
    }
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPredznak() {
        return predznak;
    }

    public void setPredznak(int predznak) {
        this.predznak = predznak;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    

}