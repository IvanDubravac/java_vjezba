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

    public char[] getLozinka() {
        return lozinka;
    }

    public void setLozinka(char[] lozinka) {
        this.lozinka = lozinka;
    }
    
    public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    
}
