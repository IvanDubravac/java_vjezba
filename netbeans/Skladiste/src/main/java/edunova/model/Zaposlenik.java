/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author marko
 */
@Entity
public class Zaposlenik extends Entitet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ime;
    private String prezime;
    private String oib;
    private String iban;

    public Zaposlenik(){
    super();
    }
    
    public Zaposlenik(String ime, String prezime, String oib, String iban, int sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.iban = iban;
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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
   
    
}
