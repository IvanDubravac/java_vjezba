/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Operater;
import edunova.model.Promet;
import edunova.util.EdunovaException;
import jakarta.persistence.NoResultException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author dell
 */
public class ObradaOperaterNovi extends ObradaOsoba<Operater> {

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater order by prezime, ime",
                Operater.class).list();
    }

    public List<Operater> read(String uvjet) {
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Operater "
                + " where concat(ime,' ',prezime,' ',ime) "
                + " like :uvjet "
                + " order by prezime, ime ",
                Operater.class)
                .setParameter("uvjet", uvjet)
                .setMaxResults(12)
                .list();
    }

    public List<Operater> read(String uvjet,
            boolean traziOdPocetkaImena) {
        uvjet = uvjet.trim();
        if (traziOdPocetkaImena) {
            uvjet = uvjet + "%";
        } else {
            uvjet = "%" + uvjet + "%";
        }

        return session.createQuery("from Operater "
                + " where concat(ime,' ',prezime,' ',ime) "
                + " like :uvjet "
                + " order by prezime, ime ",
                Operater.class)
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
        
         if(entitet.getPrometi()!=null &&
                !entitet.getPrometi().isEmpty()){
            
          StringBuilder sb = new StringBuilder();
            sb.append("Operater ");
            sb.append(entitet.getImePrezime());
            sb.append(" se ne može obrisati jer sudjeluje u transakcijama:");
            sb.append("\n");
            int b=0;
            for(Promet p : entitet.getPrometi()){
                sb.append(++b);
                sb.append(". ");
                sb.append(p.getSifra());
                sb.append("\n");
            }
            sb.append("--------");
            
            throw new EdunovaException(sb.toString());  
        }
        
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
    
    
      public Operater autoriziraj(String email, char[] lozinka){
        Operater o;
        try {
            o = session.createQuery(
                    "from Operater o where o.email=:email", 
                    Operater.class)
                    .setParameter("email",email)
                    .getSingleResult();
            
        } catch (NoResultException e) {
            return null;
        }
        
        if(BCrypt.checkpw(
                new String(lozinka), 
                new String(o.getLozinka())
                            )
                ){
            return o;
        }
        
        return null;
    }

}
