/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.controller.ObradaProizvoda;
import edunova.model.Proizvod;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;

/**
 *
 * @author marko
 */
public class Start {

    public static void main(String[] args) {
        ObradaProizvoda op=new ObradaProizvoda();
        for(Proizvod p: op.read()){
            System.out.println(p.getNaziv());
        }
    }
}
