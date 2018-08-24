package com.company;
import java.sql.*;

public class Database {
    static Connection con=null;
    static Statement stat=null;
    public static void makeconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3305/bank system", "root", "");
            stat = con.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}