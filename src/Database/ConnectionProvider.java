/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.*;

/**
 *
 * @author Asus
 */
public class ConnectionProvider {

    public static Connection getcon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BMS", "root", "root");
            return Con;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }

    }

}
