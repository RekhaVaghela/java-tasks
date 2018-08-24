package com.company;

import java.awt.*;
import javax.naming.Name;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    static JTextField user, code, Name, Address, acc_no, Gender, acc_typ, amount, amount_my_acc, amount_to_acc;
    static JRadioButton female, male , current, saver;
    static JFrame account_number_frm, main_frm;
    static JButton enter, update, proceed, transfer;
    static JPanel details, wtd, trans;
    static String recall;

    public static void main(String[] args) {
	// write your code here
        Database.makeconnection();
        JFrame login = make_login();
        login.setSize(400,200);

        login.setVisible(true);
    }

    public static JFrame make_login() {
        JFrame login = new JFrame ("Login");

        FlowLayout fl = new FlowLayout();
        JLabel user_name = new JLabel("User Name");
        JLabel password = new JLabel("Password");
        JTextField user = new JTextField(10);
        JTextField code = new JTextField(10);
        JButton go = new JButton("Go");

        login.setLayout(fl);
        login.add(user_name);
        login.add(user);
        login.add(password);
        login.add(code);
        login.add(go);

        Event_Handler eh = new Event_Handler(user, code, Name, Address, female, male, current, saver, acc_no,  enter,  login,  details, Gender,  acc_typ, update, wtd, amount);
        go.addActionListener(eh);

        return login;
    }

    public static JFrame make_main_frame(String S) {
        JFrame main_frm = new JFrame("Bank System");
        JMenuBar mb = new JMenuBar();
        JMenu user_s = new JMenu("User");
        JMenu user_report = new JMenu("User Reports");


        JMenuItem user_detail = new JMenuItem("User Details");
                user_detail.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        make_acc_no("view");
                    }
                });
        JMenuItem with = new JMenuItem("Withdrawal");
                with.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        make_acc_no("withdraw");
                    }
                });
        JMenuItem trans = new JMenuItem("Transfer");
                trans.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        main_frm.add(Event_Handler_Transfer.transfers());
                        main_frm.revalidate();
                    }
                });
        JMenuItem dep = new JMenuItem("Deposit");
                dep.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        make_acc_no("deposit");
                    }
                });






        JMenuItem view_statement  = new JMenuItem("Statement");
                view_statement.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){ make_acc_no("list S");
            }
        });
        JMenuItem view_balance  = new JMenuItem("Current Balance");
                view_balance.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){make_acc_no("CB");

            }
        });





        JMenuItem withdrawal = new JMenuItem("List of Withdrawals");
                withdrawal.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        make_acc_no("list W");
                    }
                });
        JMenuItem transfer = new JMenuItem("List of Transfers");
                transfer.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        make_acc_no("list T");

                    }
                });
        JMenuItem deposit = new JMenuItem("List of Deposits");
                deposit.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent E){
                        make_acc_no("list D");
                    }
                });

        if (S.equals("Admin")) {
            JMenu admin = new JMenu("Admin");
            JMenu admin_report = new JMenu("Admin Reports");
            JMenuItem admin_insert = new JMenuItem("Insert");
                    admin_insert.addActionListener( new ActionListener(){
                        public void actionPerformed(ActionEvent E){
                            System.out.println("yhhe");
                            main_frm.add(user_details());
                            JButton save = new JButton("Save");
                            main_frm.add(save, BorderLayout.SOUTH);
                            main_frm.revalidate();
                          //  make_acc_no("");
                            Event_Handler_Insert event_h = new Event_Handler_Insert(Name, Address, female, male, current, saver, save);
                            save.addActionListener(event_h);
                        }
                    });
            JMenuItem admin_edit = new JMenuItem("Edit");
                    admin_edit.addActionListener( new ActionListener(){
                        public void actionPerformed(ActionEvent E){
                            make_acc_no("edit");
                        }
                    });
            JMenuItem admin_delete = new JMenuItem("Delete");
                    admin_delete.addActionListener( new ActionListener(){
                        public void actionPerformed(ActionEvent E){
                            make_acc_no("delete");
                        }
                    });
            JMenuItem female = new JMenuItem("List of all female accounts");
            female.addActionListener( new Reports(main_frm, "F"));

            JMenuItem male = new JMenuItem("List of all male accounts");
            male.addActionListener( new Reports(main_frm, "M"));

            JMenuItem current = new JMenuItem("List of all current accounts");
            current.addActionListener( new Reports(main_frm, "C"));

            JMenuItem saver = new JMenuItem("List of all saver accounts");
            saver.addActionListener( new Reports(main_frm, "S"));

            JMenuItem all = new JMenuItem("List of all accounts");
            all.addActionListener( new Reports(main_frm, ""));

            mb.add(admin);
            mb.add(admin_report);
            admin.add(admin_insert);
            admin.add(admin_edit);
            admin.add(admin_delete);
            admin_report.add(female);
            admin_report.add(male);
            admin_report.add(current);
            admin_report.add(saver);
            admin_report.add(all);
        }

        main_frm.setJMenuBar(mb);

        mb.add(user_s);
        mb.add(user_report);
        user_s.add(user_detail);
        user_s.add(with);
        user_s.add(trans);
        user_s.add(dep);
        user_report.add(view_balance);
        user_report.add(view_statement);
        user_report.add(withdrawal);
        user_report.add(transfer);
        user_report.add(deposit);

        main_frm.setSize(300,300);

        return main_frm;
    }

    public static void make_acc_no(String choice) {
        JFrame account_number_frm = new JFrame(choice);
        JPanel P1=new JPanel();
        JLabel account_number = new JLabel("Account Number");
        JTextField acc_no = new JTextField(10);
        JButton enter = new JButton("Enter");
        details();
        wtd();
        Event_Handler eh = new Event_Handler(user, code, Name, Address, female, male, current, saver, acc_no,  enter,  account_number_frm,  details, Gender,  acc_typ, update,wtd,amount);
        enter.addActionListener(eh);

        P1.add(account_number);
        P1.add(acc_no);
        P1.add(enter);

        account_number_frm.add(P1,BorderLayout.NORTH);
        account_number_frm.setSize(400, 400);
        account_number_frm.setVisible(true);
    }

    public static JPanel user_details(){

        JPanel user_details_frm = new JPanel(new GridLayout(4,3));
        JLabel name = new JLabel ("Name");
        JLabel address = new JLabel ("Address");
        JLabel gender = new JLabel ("Gender");
        JLabel acc_typ = new JLabel ("Account Type");
        Name = new JTextField (20);
        Address = new JTextField (50);
        female = new JRadioButton ("Female");
        male = new JRadioButton ("Male");
        current = new JRadioButton ("Current");
        saver = new JRadioButton ("Saver");
        ButtonGroup gendergrp=new ButtonGroup();
        ButtonGroup accountgrp=new ButtonGroup();

        gendergrp.add(male);
        gendergrp.add(female);
        accountgrp.add(current);
        accountgrp.add(saver);


        user_details_frm.add(name);
        user_details_frm.add(Name);
        user_details_frm.add(new Label());

        user_details_frm.add(address);
        user_details_frm.add(Address);
        user_details_frm.add(new Label());

        user_details_frm.add(gender);
        user_details_frm.add(female);
        user_details_frm.add(male);

        user_details_frm.add(acc_typ);
        user_details_frm.add(current);
        user_details_frm.add(saver);

        user_details_frm.setVisible(true);

        return user_details_frm;
    }

    public static JPanel details(){

        details = new JPanel(new GridLayout(4,2));
        JLabel name = new JLabel ("Name");
        JLabel address = new JLabel ("Address");
        JLabel gender = new JLabel ("Gender");
        JLabel acc_type = new JLabel ("Account Type");
        Name = new JTextField (20);
        Address = new JTextField (50);
        Gender = new JTextField (20);
        acc_typ = new JTextField (50);

        details.add(name);
        details.add(Name);

        details.add(address);
        details.add(Address);

        details.add(gender);
        details.add(Gender);

        details.add(acc_type);
        details.add(acc_typ);

        Gender.setEditable(false);
        acc_typ.setEditable(false);

        return details;
    }

    public static void wtd(){
        JPanel wtd = new JPanel(new GridLayout(1,3));
        JLabel Amount = new JLabel ("Amount");
        JTextField amount = new JTextField (5);
        JButton proceed = new JButton ("Proceed");
        wtd.add(Amount);
        wtd.add(amount);
        wtd.add(proceed);
    }

}
