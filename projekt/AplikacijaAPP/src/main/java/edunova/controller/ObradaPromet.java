/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Proizvod;
import edunova.model.Promet;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author marko
 */
public class ObradaPromet extends Obrada<Promet>{
    
     @Override
    public List<Promet> read() {
        return session.createQuery("from Promet", 
                Promet.class).list();
    }
    
    public List<Promet> read(Proizvod p) {
        return session.createQuery("from Promet"
                + " where proizvod=:proizvod "
                + " order by vrijeme desc", 
                Promet.class)
                .setParameter("proizvod", p)
                .list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        if(entitet.getProizvod().getSifra()==0){
            throw new EdunovaException("Obavezno odabir proizvoda");
        }
        if(entitet.getOperater().getSifra()==0){
            entitet.setOperater(null);
        }
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    
//          
        
    }
}