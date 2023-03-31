/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Vrsta;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author marko
 */
public class ObradaVrsta extends Obrada<Vrsta>{
     @Override
    public List<Vrsta> read() {
        return session.createQuery("from Vrsta", 
                Vrsta.class).list();
    }
    
    

    @Override
    protected void kontrolaUnos() throws EdunovaException {
       
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        
    }
}
