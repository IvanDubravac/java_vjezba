/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

/**
 *
 * @author dell
 */
@Entity
public class Operater extends Osoba{
    
    @Column(columnDefinition = "char(61)")
    private char[] lozinka;
    private String iban;

    public Operater() {
    super();
    }

    public Operater(char[] lozinka, String iban) {
        this.lozinka = lozinka;
        this.iban = iban;
    }

    public Operater(char[] lozinka, String iban, int sifra, String ime, String prezime, String oib, String email) {
        super(sifra, ime, prezime, oib, email);
        this.lozinka = lozinka;
        this.iban = iban;
    }
    

    

    public char[] getLozinka() {
        return lozinka;
    }

    public void setLozinka(char[] lozinka) {
        this.lozinka = lozinka;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }


    
    public String getImePrezime(){
    return getIme()+" "+ getPrezime();
    }
    
}