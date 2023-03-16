/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author dell
 */
public class ObradaSmjer extends Obrada<Smjer>{

    @Override
    public List<Smjer> read() {
        // https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
       return session.createQuery(
               "from Smjer order by naziv", 
               Smjer.class)
               .list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaNazivNull();
        kontrolaNazivNijeBroj();
        kontrolaNazivMinimalnaDuzina();
        kontrolaNazivMaksimalnaDuzina();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        if(entitet.getGrupe()!=null &&
                !entitet.getGrupe().isEmpty()){
            
            StringBuilder sb = new StringBuilder();
            sb.append("Smjer ");
            sb.append(entitet.getNaziv());
            sb.append(" se ne može obrisati jer ima grupe:");
            sb.append("\n");
            int b=0;
            for(Grupa g : entitet.getGrupe()){
                sb.append(++b);
                sb.append(". ");
                sb.append(g.getNaziv());
                sb.append("\n");
            }
            sb.append("--------");
            
            throw new EdunovaException(sb.toString());
        }
    }
    
    protected void kontrolaCijena() throws EdunovaException {
        if(entitet.getCijena()==null ||
                entitet.getCijena().compareTo(BigDecimal.ZERO)<=0 ||
                entitet.getCijena().compareTo(new BigDecimal(10000))==1){
            throw new EdunovaException("Cijena mora biti postavljena, "
                    + "veća od 0 i manja od 10000");
        }
    }

    private void kontrolaNaziv() throws EdunovaException  {
        kontrolaNazivNull();
        kontrolaNazivNijeBroj();
        kontrolaNazivMinimalnaDuzina();
        kontrolaNazivMaksimalnaDuzina();
        kontrolaNazivDupliUBazi();
    }
    
    private void kontrolaNazivDupliUBazi() throws EdunovaException  {
        List<Smjer> smjerovi=null;
        try {
            smjerovi = session.createQuery("from Smjer s "
                    + " where s.naziv=:naziv", 
                    Smjer.class)
                    .setParameter("naziv", entitet.getNaziv())
                    .list();
        } catch (Exception e) {
        }
        if(smjerovi!=null && !smjerovi.isEmpty()){
            throw new EdunovaException("Smjer s istim nazivom postoji u bazi");
        }
    }
    
    private void kontrolaNazivNull() throws EdunovaException  {
        if(entitet.getNaziv()==null){
            throw new EdunovaException("Naziv mora biti postavljen");
        }
    }
    
    private void kontrolaNazivMaksimalnaDuzina() throws EdunovaException  {
         if(entitet.getNaziv().trim().length()>50){
             throw new EdunovaException("Naziv smjera može imati maksimalno 50 znakova");
         } 
    }
    
     private void kontrolaNazivMinimalnaDuzina() throws EdunovaException  {
         if(entitet.getNaziv().trim().length()<3){
             throw new EdunovaException("Naziv smjera mora imati minimalno 3 znaka");
         } 
    }

    private void kontrolaNazivNijeBroj() throws EdunovaException  {
     
        boolean broj=false;
        
        try {
            Double.parseDouble(entitet.getNaziv());
            broj=true;
        } catch (Exception e) {
            
        }
        
        if(broj){
            throw new EdunovaException("Naziv smjera ne smije biti broj");
        }
        
    }
    
}
