/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author dell
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    public List<Grupa> read() {
        return session.createQuery("from Grupa", 
                Grupa.class).list();
    }
    
    public List<Grupa> read(Smjer s) {
        return session.createQuery("from Grupa "
                + " where smjer=:smjer "
                + " order by datumPocetka desc", 
                Grupa.class)
                .setParameter("smjer", s)
                .list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        if(entitet.getSmjer().getSifra()==0){
            throw new EdunovaException("Obavezno odabir smjera");
        }
        if(entitet.getPredavac().getSifra()==0){
            entitet.setPredavac(null);
        }
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        
    }
    
}
