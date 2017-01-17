/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesion;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author dev
 */
public class Cesion {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        Cesion objeto = new Cesion();
        objeto.cargarDriver();
        String dbURL = "jdbc:mysql://localhost:3306/prodferreteria"; 
        String username ="root"; 
        String password = "NSloteria2015"; 
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select count(*) from documentos"; 
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);  
           while(rs.next()){ 
              int count = rs.getInt(1);
              System.out.println("count of stock : " + count); 
              JOptionPane.showMessageDialog(null, "count of stock : " + count);
          } 
         
        } catch(SQLException ex){
          System.out.println("Nop" ); 
        }
          
}
    private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {

    }
  }
} 




