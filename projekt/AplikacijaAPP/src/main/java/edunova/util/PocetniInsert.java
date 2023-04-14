/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Operater;
import edunova.model.Proizvod;
import edunova.model.Promet;
import edunova.model.Vrsta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author marko
 */
public class PocetniInsert {

    
    private static final int BROJ_PROIZVODA = 100;
    private static final int BROJ_PROMETA = 50;

    private Session session;
    private Faker faker;
    private List<Operater> operateri;
    private List<Proizvod> proizvodi;
    private List<Vrsta> vrste;
    private List<Promet> prometi;

    public PocetniInsert() {
        faker = new Faker();
        operateri = new ArrayList<>();
        proizvodi = new ArrayList<>();
        prometi = new ArrayList<>();
        vrste=new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajOperatere();
        kreirajProizode();
        kreirajVrste();
        kreirajPromete();
        session.getTransaction().commit();

    }

    private void kreirajOperatere() {
         Operater o1 = new Operater();
        o1.setIme("Ivan");
        o1.setPrezime("Dubravac");
        o1.setIban("HR3223400092724761275");
        o1.setOib("03461468591");
        o1.setEmail("ivandubravac@gmail.com");
        o1.setLozinka(BCrypt.hashpw("edunova", 
                BCrypt.gensalt()).toCharArray());
        
         Operater o2 = new Operater();
        o2.setIme("Nikola");
        o2.setPrezime("Juzbašić");
        o2.setIban("HR6825000091238256895");
        o2.setOib("03461468593");
        o2.setEmail("njuzbasic@gmail.com");
        o2.setLozinka(BCrypt.hashpw("edunova", 
                BCrypt.gensalt()).toCharArray());
        
         Operater o3 = new Operater();
        o3.setIme("Dorian");
        o3.setPrezime("Garac");
        o3.setIban("HR5225000096938364892");
        o3.setOib("03461468597");
        o3.setEmail("dgarac@gmail.com");
        o3.setLozinka(BCrypt.hashpw("edunova", 
                BCrypt.gensalt()).toCharArray());
        
        session.persist(o1);
        session.persist(o2);
        session.persist(o3);
        operateri.add(o1);    
        operateri.add(o2);
        operateri.add(o3);
        
        
       
        
        
    }

    private void kreirajProizode() {
        Proizvod p;
        for (int i = 0; i < BROJ_PROIZVODA; i++) {
            p = new Proizvod();
            p.setNaziv(faker.commerce().productName());
            p.setCijena(new BigDecimal(faker.number().randomNumber()));
            p.setNetoKolicina(new BigDecimal(faker.number().numberBetween(0, 1000)));
            
           
            session.persist(p);
            proizvodi.add(p);
        }
    }

    private void kreirajVrste() {
        Vrsta v1 ,v2;
        v1=new Vrsta();
        v2=new Vrsta();
        v1.setNaziv("Doprema");
        v1.setPredznak(1);
        v2.setNaziv("Odprema");
        v2.setPredznak((-1));
        session.persist(v1);
        session.persist(v2);
        vrste.add(v1);
        vrste.add(v2);
        

    }

    private void kreirajPromete() {
        Promet p;
        for (int i = 0; i < BROJ_PROMETA; i++) {
            p = new Promet();
            p.setVrijeme(faker.date().birthday(1, 5));
            p.setVrsta(vrste.get(sb(0, vrste.size()-1)));
            p.setKolicina(new BigDecimal(faker.number().numberBetween(0, 1000)));
            p.setOperater(operateri.get(sb(0, operateri.size()-1)));
            p.setProizvod(proizvodi.get(sb(0, proizvodi.size()-1)));
            session.persist(p);
            prometi.add(p);
            
         
        }
    }

    private int sb(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}