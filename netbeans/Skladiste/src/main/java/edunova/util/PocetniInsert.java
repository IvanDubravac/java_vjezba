/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Proizvod;
import edunova.model.Promet;
import edunova.model.Vrsta;
import edunova.model.Zaposlenik;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.hibernate.Session;

/**
 *
 * @author marko
 */
public class PocetniInsert {

    private static final int BROJ_ZAPOSLENIKA = 5;
    private static final int BROJ_PROIZVODA = 5000;
    private static final int BROJ_VRSTA = 2;
    private static final int BROJ_PROMETA = 10000;

    private Session session;
    private Faker faker;
    private List<Zaposlenik> zaposlenici;
    private List<Proizvod> proizvodi;
    private Vrsta v[] = new Vrsta[BROJ_VRSTA];
    private List<Promet> prometi;

    public PocetniInsert() {
        faker = new Faker();
        zaposlenici = new ArrayList<>();
        proizvodi = new ArrayList<>();
        prometi = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajZaposlenike();
        kreirajProizode();
//        kreirajVrste();
        kreirajPromete();
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
        for (int i = 0; i < BROJ_PROIZVODA; i++) {
            p = new Proizvod();
            p.setNaziv(faker.commerce().productName());
            p.setCijena(new BigDecimal(faker.number().randomNumber()));
            p.setZemljaPodrijetla(faker.country().name());
            p.setNetoKolicina(new BigDecimal(faker.number().randomNumber()));
            session.persist(p);
            proizvodi.add(p);
        }
    }

//    private void kreirajVrste() {
//        v[0] = new Vrsta("Doprema", 1, 1);
//        v[1] = new Vrsta("Odprema", (-1), 2);
//        session.persist(v);
//
//    }

    private void kreirajPromete() {
        Promet p;
        List<Proizvod> pr;
        for (int i = 0; i < BROJ_PROMETA; i++) {
            p = new Promet();
            p.setVrijeme(faker.date().birthday(1, 5));
            p.setKolicina(new BigDecimal(faker.number().randomNumber()));
            p.setZaposlenik(zaposlenici.get(sb(0, 1)));
            pr = new ArrayList<>();
            
            
            for (int j = 0; j < sb(5, 55); j++) {
                pr.add(proizvodi.get(sb(0, BROJ_PROIZVODA-1)));
            }
            p.setProizvodi(pr);
            session.persist(p);
        }
    }

    private int sb(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
