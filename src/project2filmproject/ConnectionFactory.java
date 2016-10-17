/*<h1>ConnectionFactory</h1>
 *@param
 */


package project2filmproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class ConnectionFactory{
    public static Connection getConnection(/*ändra till hash?*/
       /* String userName, String */) throws Exception{ 
        String url = "jdbc:mysql://localhost/filmregister";
        String namn = "root";
        String löss = "";
        Connection connection = (com.mysql.jdbc.Connection)DriverManager.getConnection(url, namn, löss);
        System.out.println(connection);
        return connection;
    }
    

    
    
    public static Boolean Autentisering(String username, String password){
    //kolla autentisering, och skicka om true till getConnection
    return true;
    }
    
}
