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

/**
 *
 * @author dev
 */
public class Conexion {
    //Dennis
/*
 public static String ip="45.7.230.72";
 public static String base="ferreteria2";
 public static String usuario="nelstu";
 public static String pass="armijo183ISLA";
     */

    public static String ip = "";
    public static String base = "";
    public static String usuario = "";
    public static String pass = "";
    public static String carpeta = "";

    public static void datos() {
        String ruta = System.getProperty("user.dir");
        System.out.println(ruta);
        String fileName = "pos.db";
        String url = "jdbc:sqlite:" + ruta + "/" + fileName;

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql = "SELECT * FROM ruta WHERE id=1";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {

                ip = rs.getString("ip");
                usuario = rs.getString("usuario");
                pass = rs.getString("clave");
                base = rs.getString("base");
                carpeta = rs.getString("carpeta");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    /* 
    public static String ip="www.nservicios.cl";
    public static String base="cns58953_Brujas";
    public static String usuario="cns58953_brujas";
    public static String pass="NSloteria2015";
/*
    //linares
/*    
   public static String ip="45.236.131.236";
   public static String base="ierp";
   public static String usuario="nelstu";
   public static String pass="armijo183ISLA";

    //linares testing
 /*
    public static String ip="45.236.131.236";
    public static String base="testing";
    public static String usuario="nelstu";
    public static String pass="armijo183ISLA";
     */
 /*
     public static String ip="127.0.0.1";
   public static String base="ierp";
   public static String usuario="root";
   public static String pass="NSloteria2015";
     */
}
