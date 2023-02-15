/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

/**
 *
 * @author marko
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Osoba osoba=new Osoba();
        osoba.setIme("Ivan");
        osoba.setPrezime("Dubravac");
        
        System.out.println(osoba.getIme());
        new Prozor().setVisible(true);
        
        
       
    }
}
