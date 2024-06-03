
package Modelo;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    String url = "jdbc:mysql://localhost:3306/estudiante_db";
    String user ="root", password = "admin";
    Connection con;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(url,user,password);
        }catch(Exception e){
            System.out.println("Exception en getConnection " + e);
        }
        return con;
    }
}
