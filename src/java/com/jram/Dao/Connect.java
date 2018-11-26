package com.jram.Dao;

import java.sql.*;

public class Connect {

    private static String database = "CitasWeb";
    private static String user = "root";
    private static String pass = "thoneonejhbr";
    private static String url = "jdbc:mysql://localhost/" + database;

    Connection con = null;

    public Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);

            if (con != null) {
                System.out.println("Conectado a: " + database);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public Connection Start() {
        return con;
    }

    public void Disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}
