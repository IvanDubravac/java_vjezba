/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edunova;


import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.util.HibernateUtil;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Hibernate;
import static org.junit.jupiter.api.Assertions.*;
import static edunova.util.HibernateUtil.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dell
 */
public class PrimjerJUnitTest  {
   

    //https://www.baeldung.com/junit-5
    //https://stackoverflow.com/questions/36427868/failed-to-execute-goal-org-apache-maven-pluginsmaven-surefire-plugin2-12test
     @Test
     public void prviTest() {
         
         getSession();
       int[] numbers = {0, 1, 2, 3, 4};
     assertAll("numbers",
         () -> assertEquals(numbers[0], 0),
         () -> assertEquals(numbers[3], 3),
         () -> assertEquals(numbers[4], 4)
     );
     }
     
     
      @Test
     public void dodavanjeSmjera() {
          Smjer s = new Smjer();
          s.setNaziv("test");
          s.setCijena(new BigDecimal(100));
          s.setUpisnina(new BigDecimal(199));
          s.setTrajanje(100);
          ObradaSmjer os = new ObradaSmjer();
          os.setEntitet(s);
          try {
              os.create();
              assertTrue(s.getSifra()>0);
          } catch (Exception e) {
              fail("Nije dodan novi smjer");
          }
                 
     }
     
     
}
