package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Handler_Proceed implements ActionListener {
    JTextField amount;
    JTextField acc_no;
    JButton proceed;
    JFrame account_number_frm;

    public Event_Handler_Proceed(JTextField amount, JTextField acc_no, JButton proceed, JFrame account_number_frm){
        this.amount = amount;
        this.acc_no = acc_no;
        this.proceed = proceed;
        this.account_number_frm = account_number_frm;
    }

    public void actionPerformed(ActionEvent T) {
        String Choice=account_number_frm.getTitle();
        String label = ((JButton) T.getSource()).getText();
        //String MenuItem = ((JButton) T.getSource()).getText();
        if (label.equals("Proceed")){
            if(Choice.equals("withdraw")){
                {
                    try{
                        String str = "insert into `withdrawal` (`Account Number`  ,  `Amount`  ,  `Date` ) values('" + (acc_no.getText() + "'" + ","  +   amount.getText()   +  ","   +  "now())"  );
                        System.out.println(str);
                        Database.stat.executeUpdate(str);
                        //INSERT INTO `withdrawal`values ('abc', 400, now())
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            if(Choice.equals("deposit")){
                {
                    try{
                        String str = "insert into `deposits` (`Account Number`  ,  `Amount`  ,  `Date` ) values('" + (acc_no.getText() + "'" + ","  +   amount.getText()   +  ","   +  "now())"  );
                        System.out.println(str);
                        Database.stat.executeUpdate(str);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }


                }
            }
        }
    }
}
