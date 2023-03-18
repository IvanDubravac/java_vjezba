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
public class Zaposlenik extends Osoba {

    private String iban;

    public Zaposlenik() {
        super();
    }

    public Zaposlenik(String iban) {
        this.iban = iban;
    }

    public Zaposlenik(String iban, int sifra, String ime, String prezime, String oib, String email) {
        super(sifra, ime, prezime, oib, email);
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

}
