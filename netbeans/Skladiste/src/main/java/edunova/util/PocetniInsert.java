/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Proizvod;
import edunova.model.Zaposlenik;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author marko
 */
public class PocetniInsert {

    private static final int BROJ_ZAPOSLENIKA = 5;
    private static final int BROJ_PROIZVODA=5000;

    private Session session;
    private Faker faker;
    private List<Zaposlenik> zaposlenici;
    private List<Proizvod> proizvodi;

    public PocetniInsert() {
        faker = new Faker();
        zaposlenici = new ArrayList<>();
        proizvodi=new ArrayList<>();

        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajZaposlenike();
        kreirajProizode();

        session.getTransaction().commit();

    }

    private void kreirajZaposlenike() {
        Zaposlenik z;
        for (int i = 0; i < BROJ_ZAPOSLENIKA; i++) {
            z = new Zaposlenik();
            z.setIme(faker.name().firstName());
            z.setPrezime(faker.name().lastName());
            z.setOib(Alati.dovuciOib());
            z.setIban("HR" + Alati.dovuciOib());
            session.persist(z);
            zaposlenici.add(z);

        }
    }

    private void kreirajProizode() {
       Proizvod p;
       for(int i=0 ; i<BROJ_PROIZVODA; i++){
       p=new Proizvod();
       p.setNaziv(faker.commerce().productName());
       p.setCijena(new BigDecimal(faker.number().randomNumber()));
       p.setZemljaPodrijetla(faker.country().name());
       p.setNetoKolicina(new BigDecimal(faker.number().randomNumber()));
       session.persist(p);
       proizvodi.add(p);
       }
    }

}
