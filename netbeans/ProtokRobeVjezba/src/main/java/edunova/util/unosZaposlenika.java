/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Zaposlenik;
import org.hibernate.Session;

/**
 *
 * @author marko
 */
public class unosZaposlenika {
    
    public static void izvedi(){
    Session session = HibernateUtil.getSession();
    Faker faker=new Faker();
    
     Zaposlenik z;
     
     session.beginTransaction();
     for(int i=0; i<333; i++){
     z=new Zaposlenik();
     z.setIme(faker.name().firstName());
     z.setPrezime(faker.name().lastName());
     z.setOib(faker.idNumber().valid());
     z.setIban(faker.finance().iban());
     
     session.persist(z);
     }
     
      session.getTransaction().commit();
     
     
     
     }
            
        
        
    
    }
    
 
