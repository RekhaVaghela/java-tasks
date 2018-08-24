package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3305/school", "root", "");
            Statement S = C.createStatement();
            S.executeUpdate("insert into school values(24,'Mary', 143)");
            ResultSet R = S.executeQuery("select * from school");

            while (R.next()) {
                System.out.println(R.getInt("RegNo"));
                System.out.println(R.getString("Name"));
                System.out.println(R.getInt("Marks"));
            }
        }
        catch(Exception E) {
            System.out.println(E.getMessage());

        }
    }
}
