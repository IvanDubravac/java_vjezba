/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;


import edunova.model.Proizvod;
import edunova.model.Promet;
import edunova.util.EdunovaException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author dell
 */
public class ObradaProizvod extends Obrada<Proizvod> {

    @Override
    public List<Proizvod> read() {
    
       return session.createQuery(
               "from Proizvod order by naziv", 
               Proizvod.class)
               .list();
    }
    
    public List<Proizvod> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Proizvod where concat(naziv,' ',naziv) like :uvjet order by naziv ", Proizvod.class).
                setParameter("uvjet", uvjet).setMaxResults(20).list();
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
            
        if(entitet.getPrometi()!=null &&
                !entitet.getPrometi().isEmpty()){
            
          StringBuilder sb = new StringBuilder();
            sb.append("Proizvod ");
            sb.append(entitet.getNaziv());
            sb.append(" se ne može obrisati jer se nalazi u prometu:");
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
    
    protected void kontrolaCijena() throws EdunovaException {
        if(entitet.getCijena()==null ||
                entitet.getCijena().compareTo(BigDecimal.ZERO)<=0 ||
                entitet.getCijena().compareTo(new BigDecimal(1000000000))==1){
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
        List<Proizvod> smjerovi=null;
        try {
            smjerovi = session.createQuery("from Proizvod p "
                    + " where p.naziv=:naziv", 
                    Proizvod.class)
                    .setParameter("naziv", entitet.getNaziv())
                    .list();
        } catch (Exception e) {
        }
        if(smjerovi!=null && !smjerovi.isEmpty()){
            throw new EdunovaException("Proizod s istim nazivom postoji u bazi");
        }
    }
    
    private void kontrolaNazivNull() throws EdunovaException  {
        if(entitet.getNaziv()==null){
            throw new EdunovaException("Naziv mora biti postavljen");
        }
    }
    
    private void kontrolaNazivMaksimalnaDuzina() throws EdunovaException  {
         if(entitet.getNaziv().trim().length()>50){
             throw new EdunovaException("Naziv proizvoda može imati maksimalno 50 znakova");
         } 
    }
    
     private void kontrolaNazivMinimalnaDuzina() throws EdunovaException  {
         if(entitet.getNaziv().trim().length()<3){
             throw new EdunovaException("Naziv proizvoda mora imati minimalno 3 znaka");
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
            throw new EdunovaException("Naziv proizvoda ne smije biti broj");
        }
        
    }
    
}