/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sergio
 */


public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/comercio";
    //private static final String URL = "jdbc:mysql://10.12.46.43:3306/comercio";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    //private static final String USER = "cross";
    //private static final String PASSWORD = "kevinsama";
    private Connection con;

    public Conexion() {
        try {
            

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conexion exitosa");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("error conexion 1");
        } catch (SQLException esql) {
            System.out.println(esql.getMessage());
            System.out.println("error conexion 2");

        }
    }

    public Connection getConnection() {

        return con;
    }

}

