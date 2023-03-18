/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author dell
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{

    @Override
    public List<Polaznik> read() {
       return session.createQuery("from Polaznik order by prezime, ime", 
               Polaznik.class).list();
    }
    
    public List<Polaznik> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
       return session.createQuery("from Polaznik "
               + " where concat(ime,' ',prezime,' ',ime) "
               + " like :uvjet "
               + " order by prezime, ime ", 
               Polaznik.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(12)
               .list();
    }
    
    public List<Polaznik> read(String uvjet, 
            boolean traziOdPocetkaImena) {
        uvjet=uvjet.trim();
        if(traziOdPocetkaImena){
            uvjet = uvjet + "%";
        }else{
            uvjet = "%" + uvjet + "%";
        }
        
       return session.createQuery("from Polaznik "
               + " where concat(ime,' ',prezime,' ',ime) "
               + " like :uvjet "
               + " order by prezime, ime ", 
               Polaznik.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(12)
               .list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos();
        // ovdje dođu kontrole za svojtva iz klase Polaznika
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        super.kontrolaPromjena(); 
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        super.kontrolaBrisanje(); 
    }
    
    
    
    
    
    
    
}
