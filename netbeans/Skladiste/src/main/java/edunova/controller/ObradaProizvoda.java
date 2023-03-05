/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Entitet;
import edunova.model.Proizvod;
import edunova.util.SkladisteException;
import java.util.List;

/**
 *
 * @author marko
 */
public class ObradaProizvoda extends Obrada<Proizvod>{

    @Override
    public List<Proizvod> read() {
        return session.createQuery("from Proizvod", Proizvod.class).list();
    }

    @Override
    protected void kontrolaUnosa() throws SkladisteException {
        
    }

    @Override
    protected void kontrolaPromjena() throws SkladisteException {
     
    }

    @Override
    protected void kontrolaBrisanje() throws SkladisteException {
        
    }
    
}
