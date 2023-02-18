/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marko
 */
public class Edunova01 {
      private String myDriver = "org.mariadb.jdbc.Driver";
      private String myUrl = "jdbc:mariadb://localhost/edunovajp27";
      private Connection conn;
    
    public Edunova01(){
         spojiSeNaBazu();
         primjerSelect();
         
     
    }

    public static void main(String[] args) {
        new Edunova01();
    }

    private void spojiSeNaBazu() {
          try {
               Class.forName(myDriver);
               conn = DriverManager.getConnection(myUrl, "root", "");
           } catch (ClassNotFoundException ex) {
               ex.printStackTrace();
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
    }

    private void primjerSelect() {
        String query = "select * from smjer";
          try {
              Statement st = conn.createStatement();
              ResultSet rs = st.executeQuery(query);
              while (rs.next()){
                  System.out.println(rs.getString("naziv"));
              
              }

          } catch (SQLException ex) {
              ex.printStackTrace();
          }
    }
}
