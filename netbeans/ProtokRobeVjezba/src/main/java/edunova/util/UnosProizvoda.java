/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Proizvod;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.hibernate.Session;

/**
 *
 * @author marko
 */
public class UnosProizvoda {
    
    public static void izvedi(){
    Session session = HibernateUtil.getSession();
    Faker faker=new Faker();
    
        Proizvod p;
     
     session.beginTransaction();
     for(int i=0; i<100; i++){
         p=new Proizvod();
         p.setNaziv(faker.commerce().productName());
         p.setCijena(new BigDecimal(faker.commerce().price()));
         p.setZemljaPodrijetla(faker.address().country());
         
         
         
     
     
     session.persist(p);
     }
     
      session.getTransaction().commit();
     
     
     
     }
            
  }
    