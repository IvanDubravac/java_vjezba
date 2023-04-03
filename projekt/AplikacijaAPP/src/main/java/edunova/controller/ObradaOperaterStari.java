/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Operater;
import edunova.util.EdunovaException;
import jakarta.persistence.NoResultException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author dell
 */
public class ObradaOperaterStari extends ObradaOsoba<Operater>{

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater",Operater.class).list();
    }
    
    
    public void unosAdminOperatera(){
        Operater o1 = new Operater();
        o1.setIme("Admin1");
        o1.setPrezime("Operater1");
        o1.setEmail("coleba@gmail.com");
        o1.setOib("03461468591");
        o1.setLozinka(BCrypt.hashpw("edunova1", 
                BCrypt.gensalt()).toCharArray());
        
         Operater o2 = new Operater();
        o2.setIme("Admin");
        o2.setPrezime("Operater2");
        o2.setEmail("rbarrows123@hotmail.com");
        o2.setOib("03461468592");
        o2.setLozinka(BCrypt.hashpw("edunova2", 
                BCrypt.gensalt()).toCharArray());
        
         Operater o3 = new Operater();
        o3.setIme("Admin3");
        o3.setPrezime("Operater3");
        o3.setEmail("nikolnikol@hotmail.com");
        o3.setOib("03461468593");
        o3.setLozinka(BCrypt.hashpw("edunova3", 
                BCrypt.gensalt()).toCharArray());
        
         Operater o4 = new Operater();
        o4.setIme("Admin");
        o4.setPrezime("Operater4");
        o4.setEmail("donvito999@yahoo.com");
        o4.setOib("03461468594");
        o4.setLozinka(BCrypt.hashpw("edunova4", 
                BCrypt.gensalt()).toCharArray());
        
         Operater o5 = new Operater();
        o5.setIme("Admin");
        o5.setPrezime("Operater5");
        o5.setEmail("royyy@hotmail.com");
        o5.setOib("03461468595");
        o5.setLozinka(BCrypt.hashpw("edunova5", 
                BCrypt.gensalt()).toCharArray());
        
        
        
        setEntitet(o1);
//        setEntitet(o2);
//        setEntitet(o3);
//        setEntitet(o4);
//        setEntitet(o5);
        
        entitet=o1;
//        entitet=o2;
//        entitet=o3;
//        entitet=o4;
//        entitet=o5;
        try {
            create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
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