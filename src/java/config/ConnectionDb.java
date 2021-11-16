package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {
    Connection con;
    /* Values before stablished by test server
    String url="jdbc:mysql://172.30.2.15:3306/handle_pruebas";
    String user="root";
    */
    String url="jdbc:mysql://localhost:3306/db_ventas";
    String user="root";
    String pass="123";
    
    public Connection Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
