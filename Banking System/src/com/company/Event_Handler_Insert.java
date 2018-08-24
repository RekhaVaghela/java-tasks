package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Event_Handler_Insert implements ActionListener {
    JTextField Name;
    JTextField Address;
    JRadioButton female;
    JRadioButton male;
    JRadioButton current;
    JRadioButton saver;
    JButton save;


   public Event_Handler_Insert(JTextField Name, JTextField Address, JRadioButton female, JRadioButton male, JRadioButton current, JRadioButton saver, JButton save){
        this.Name = Name;
        this.Address = Address;
        this.female = female;
        this.male = male;
        this.current = current;
        this.saver = saver;
        this.save = save;

   }

    public void actionPerformed(ActionEvent T) {
        String label = ((JButton) T.getSource()).getText();
        String MenuItem = ((JButton) T.getSource()).getText();

        if (label.equals("Save")) {
                String gender = "";
                String acc_typ = "";
                if (male.isSelected()) gender = "M";
                if (female.isSelected()) gender = "F";
                if (current.isSelected())acc_typ = "C";
                if (saver.isSelected())acc_typ = "S";

            {
                try {
                    String s = "select concat('" + gender + "','" + acc_typ + "', LPAD(ifnull(max(substring(`Account Number`, 3, 3)) + 1,'001'), 3, '0')) as  newcode from `bank system` " +
                            "where substring(`Account Number`,1,1) =  " + "'" + gender + "'" + " and substring(`Account Number`,2,1) =" + "'" + acc_typ + "'";

                    System.out.println(s);
                    ResultSet R = Database.stat.executeQuery(s);
                    R.next();
                    String newcode = R.getString("newcode");
                    System.out.println(newcode);

                    String str = "insert into `bank system` values('" + newcode + "','" + Name.getText() + "'" + "," +
                            "'" + Address.getText() + "')";
                    System.out.println(str);
                    Database.stat.executeUpdate(str);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            Main.user_details();
        }

    }
}

