/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Zaposlenik;
import edunova.util.Alati;
import edunova.util.SkladisteException;


public abstract class ObradaZaposlenika<T extends Zaposlenik> extends Obrada<T>{

    
    @Override
    protected void kontrolaUnos() throws SkladisteException{
    kontrolaOib();
    }
    
      @Override
    protected void kontrolaPromjena() throws SkladisteException {
    
    }

    @Override
    protected void kontrolaBrisanje() throws SkladisteException{
    
    }

    private void kontrolaOib() throws SkladisteException {
        if(!Alati.kontrolaOIB(entitet.getOib())){
            throw new SkladisteException("OIB nije u dobrom formatu");
        }
    }

}
