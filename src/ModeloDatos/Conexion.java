/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paulv
 */
public class Conexion {
     public  Connection getConexion() throws ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://elhidaja-server.database.windows.net\\elhidaja@elhidaja-server:1433;databaseName=ELHIDAJA;user=elhidaja;password=Setiembre19977";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
