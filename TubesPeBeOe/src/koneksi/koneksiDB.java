/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wakya
 */
public class koneksiDB {
    private static Connection koneksiDB;
    
    public static Connection GetConnection() throws SQLException {
        if (koneksiDB==null){
            new Driver();
            
            koneksiDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/sisfoloker","root","");
            
        }
        return koneksiDB;
    }
    
}
