/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Zaposlenik;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author dell
 */
public class ObradaZaposlenik extends ObradaOsoba<Zaposlenik> {

    @Override
    public List<Zaposlenik> read() {
        return session.createQuery("from Zaposlenik order by prezime, ime",
                Zaposlenik.class).list();
    }

    public List<Zaposlenik> read(String uvjet) {
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Zaposlenik "
                + " where concat(ime,' ',prezime,' ',ime) "
                + " like :uvjet "
                + " order by prezime, ime ",
                Zaposlenik.class)
                .setParameter("uvjet", uvjet)
                .setMaxResults(12)
                .list();
    }

    public List<Zaposlenik> read(String uvjet,
            boolean traziOdPocetkaImena) {
        uvjet = uvjet.trim();
        if (traziOdPocetkaImena) {
            uvjet = uvjet + "%";
        } else {
            uvjet = "%" + uvjet + "%";
        }

        return session.createQuery("from Zaposlenik "
                + " where concat(ime,' ',prezime,' ',ime) "
                + " like :uvjet "
                + " order by prezime, ime ",
                Zaposlenik.class)
                .setParameter("uvjet", uvjet)
                .setMaxResults(12)
                .list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos();
        kontrolaIBAN();

    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        super.kontrolaPromjena();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        super.kontrolaBrisanje();
    }
    
    private void kontrolaIBAN() throws EdunovaException{
        boolean provjera = false;
        String iban = entitet.getIban();
        if (iban.length() == 21) {
            if (Character.compare(iban.charAt(0), 'H') == 0) {
                if (Character.compare(iban.charAt(1), 'R') == 0) {

                    for (int i = 2; i < iban.length(); i++) {
                        if (Character.isDigit(iban.charAt(i))) {
                            provjera = true;
                        }
                    }
                }
            }
        }
        if (!provjera) {
            throw new EdunovaException("IBAN nije u dobrom formatu!");
        }
    }

}
