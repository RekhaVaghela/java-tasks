package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.sql.*;
import javax.naming.Name;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Handler implements ActionListener {

    JTextField user;
    JTextField code;
    JTextField Name;
    JTextField Address;
    JTextField Gender;
    JTextField acc_typ;
    JTextField acc_no;
    JRadioButton female;
    JRadioButton male;
    JRadioButton current;
    JRadioButton saver;
    JButton update;
    JButton enter;
    JFrame account_number_frm;
    JPanel details;
    JPanel wtd;
    JTextField amount;


    public  JPanel wtd(){
        wtd = new JPanel();
        JLabel Amount = new JLabel ("Amount £:");
        JTextField amount = new JTextField (5);
        JButton proceed = new JButton ("Proceed");
        wtd.add(Amount);
        wtd.add(amount);
        wtd.add(proceed);

        Event_Handler_Proceed event_proceed = new Event_Handler_Proceed(amount, acc_no, proceed, account_number_frm);
        proceed.addActionListener(event_proceed);
        return wtd;

    }
    public Event_Handler(JTextField user, JTextField code, JTextField Name, JTextField Address, JRadioButton female, JRadioButton male, JRadioButton current, JRadioButton saver,
                         JTextField acc_no, JButton enter, JFrame account_number_frm, JPanel details,JTextField Gender, JTextField acc_typ, JButton update,JPanel wtd, JTextField amount){
        this.user = user;
        this.code = code;
        this.Name = Name;
        this.Address = Address;
        this.female = female;
        this.male = male;
        this.current = current;
        this.saver = saver;
        this.acc_no = acc_no;
        this.enter = enter;
        this.account_number_frm = account_number_frm;
        this.details = details;
        this.Gender = Gender;
        this.acc_typ = acc_typ;
        this.update = update;
        this.details=details;


        this.wtd = wtd;
        this.amount = amount;
         }

    public void actionPerformed(ActionEvent T) {
        String Choice=account_number_frm.getTitle();
        String label = ((JButton) T.getSource()).getText();
        String MenuItem = ((JButton) T.getSource()).getText();

        if (label.equals("Go")) {
            if (user.getText().equals("User") && code.getText().equals("password"))
                Main.make_main_frame("").setVisible(true);
            if (user.getText().equals("") && code.getText().equals(""))
                Main.make_main_frame("Admin").setVisible(true);
            //Main.make_main_frame("").setVisible(true);
        }

        /*(if (label.equals("Save")) {
            {
                String gender = "";
                String acc_typ = "";
                System.out.println("hee");
                if (male.isSelected()) gender = "M";
                if (female.isSelected()) gender = "F";
                if (current.isSelected())acc_typ = "C";
                if (saver.isSelected())acc_typ = "S";

                try {
                    String s =  "select concat('"+gender+"','"+acc_typ+"', LPAD(ifnull(max(substring(`Account Number`, 3, 3)) + 1,'001'), 3, '0')) as  newcode from `bank system` " +
                            "where substring(`Account Number`,1,1) =  "   +   "'"    +   gender   +   "'"  +   " and substring(`Account Number`,2,1) ="   +   "'"  + acc_typ  +  "'";

                    System.out.println(s);
                    ResultSet R=Database.stat.executeQuery(s);
                    R.next();
                    String newcode=R.getString("newcode");
                    System.out.println(newcode);

                    String str = "insert into `bank system` values('"+ newcode+"','"  +   Name.getText()    +   "'"    +    ","   +
                                                               "'"  +   Address.getText() +   "')";
                    System.out.println(str);
                       Database.stat.executeUpdate(str);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }            }
            Main.user_details();
        }
        */
        if (label.equals("Enter")) {
            account_number_frm.add(details);
            JButton update = new JButton("");

            if (Choice.equals("edit")){
                account_number_frm.add(update, BorderLayout.SOUTH);
                update.setText("Update Record");
            }
            if (Choice.equals("delete")) {
                account_number_frm.add(update, BorderLayout.SOUTH);
                update.setText("Delete Record");
            }

            if(Choice.equals("withdraw")){account_number_frm.add(wtd(),BorderLayout.SOUTH);}
            //if(Choice.equals("transfers")){account_number_frm.add(wtd(),BorderLayout.SOUTH);}

            if(Choice.equals("deposit")){account_number_frm.add(wtd(),BorderLayout.SOUTH);}
            account_number_frm.revalidate();

            if (Choice.equals("CB")){account_number_frm.add(Current_Balance.Balance(acc_no),BorderLayout.SOUTH);}
            account_number_frm.revalidate();

            Event_Handler eh = new Event_Handler(user, code, Name, Address, female, male, current, saver, acc_no,  enter,  account_number_frm,  details, Gender,  acc_typ, update, wtd, amount);
            update.addActionListener(eh);

            System.out.println("here");

            {
                try {
                    ResultSet R = Database.stat.executeQuery("select * from `bank system` ");
                    while(R.next()) {
                        if (acc_no.getText().equals(R.getString("Account Number"))) {
                            Name.setText( R.getString("Name"));
                            Address.setText(R.getString("Address"));
                            Gender.setText(R.getString("Account Number").substring(1, 2));
                            acc_typ.setText(R.getString("Account Number").substring(0, 1));
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }
            }
        }

        if(label.equals("Update Record")) {
            try {
                String str = "update `bank system` set Name = '" + Name.getText() + "', Address = " + "'" + Address.getText() + "'" + " where `Account Number` ='" + acc_no.getText()+"'";
                System.out.println(str);

                Database.stat.executeUpdate(str);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (label.equals("Delete Record")){
            {
                try {
                    String str = "delete from `bank system` where `Account Number` = '" + acc_no.getText()+ "'";
                    Database.stat.executeUpdate(str);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        //if(label.equals("Proceed")){



    }
}
