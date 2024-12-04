/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BioskopApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gdrad
 */
public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException {
        try {
            String url="jdbc:mysql://localhost:3306/pelanggan2db";
            String username="root";
            String password="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println("Koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}
