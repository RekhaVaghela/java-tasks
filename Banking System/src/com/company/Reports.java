package com.company;

import javax.naming.Name;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import static com.company.Main.code;
import static com.company.Main.main;

public class Reports implements ActionListener{
    static  JFrame main_frm;
    String type;

    public Reports( JFrame main_frm, String type) {
        this.main_frm = main_frm;
        this.type = type;
    }
    public void actionPerformed(ActionEvent T) {
        JTextArea text_area = new JTextArea();

        String report = "";
        String query = "select * from `bank system`";
        switch (type) {
            case "M":
                query += " where substring(`Account Number`, 1,1) = 'M'";
                break;
            case "F":
                query += "where substring(`Account Number`,1,1) = 'F'";
                break;
            case "C":
                query += "where substring(`Account Number`,2,1) = 'C'";
                break;
            case "S":
                query += "where substring(`Account Number`,2,1) = 'S'";
                break;
        }

            try {
                ResultSet R = Database.stat.executeQuery(query);
                while (R.next()) {
                    report += "\nAccount Number:" + R.getString("Account Number") + "\nName:" + R.getString("Name") +
                            "\nAddress:" + R.getString("Address") + "\n" + "_________________" + "\n";
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            text_area.setText(report);
            main_frm.add(text_area);
            main_frm.revalidate();
        }
}



