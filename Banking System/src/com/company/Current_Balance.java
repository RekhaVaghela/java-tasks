package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Current_Balance implements ActionListener {
    static JPanel balance;
    JTextField current_balance;
    JButton check;
   static JTextField acc_no;


    public Current_Balance (JPanel balance, JTextField current_balance,JButton check, JTextField acc_no1) {
        this.balance = balance;
        this.current_balance = current_balance;
        this.check = check;
        acc_no = acc_no1;
            }

    public static JPanel Balance(JTextField acc_no) {
        balance = new JPanel();
        JLabel Current_Balance = new JLabel("Current Balance");
        JTextField current_balance = new JTextField(5);
        JButton check = new JButton("Check");
        balance.add(Current_Balance);
        balance.add(current_balance);
        balance.add(check);
        current_balance.setEditable(false);

        Current_Balance event_check = new Current_Balance (balance, current_balance,check, acc_no);
        check.addActionListener(event_check);

        return balance;
    }



    public void actionPerformed(ActionEvent T) {
        String label = ((JButton) T.getSource()).getText();
        //String MenuItem = ((JButton) T.getSource()).getText();
        if(label.equals("Check")){
            System.out.println("sgd");
            {
                try{
                    System.out.println("YARRR");

                    String str = "Select Get_Current_Balance('"   +  acc_no.getText() +  "')";
                    System.out.println("::::::::::::::"+str);
                    ResultSet R = Database.stat.executeQuery(str);
                    R.next();
                    current_balance.setText(Integer.toString(R.getInt(1)));

                } catch (Exception e) {
                    System.out.println(e.toString());
                }


            }

        }
    }
}



