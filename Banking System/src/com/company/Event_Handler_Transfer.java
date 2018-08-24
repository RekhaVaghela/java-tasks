package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Handler_Transfer implements ActionListener {

    static JPanel trans;
    JTextField amount_my_acc;
    JTextField amount_to_acc;
    JTextField transfer_amount;
    JButton transfer;

    public Event_Handler_Transfer(JPanel trans, JTextField amount_my_acc, JTextField amount_to_acc, JTextField transfer_amount, JButton transfer) {
        this.trans = trans;
        this.amount_my_acc = amount_my_acc;
        this.amount_to_acc = amount_to_acc;
        this.transfer = transfer;
        this.transfer_amount = transfer_amount;
    }

    public static JPanel transfers() {
        trans = new JPanel();
        JLabel my_acc = new JLabel("From Account Number");
        JTextField amount_my_acc = new JTextField(5);
        JLabel to_acc = new JLabel("To Account Number");
        JTextField amount_to_acc = new JTextField(5);
        JLabel trans_amount = new JLabel("Transfer Amount £");
        JTextField transfer_amount = new JTextField(5);
        JButton button_transfer = new JButton("Now");

        trans.add(my_acc);
        trans.add(amount_my_acc);
        trans.add(to_acc);
        trans.add(amount_to_acc);
        trans.add(trans_amount);
        trans.add(transfer_amount);
        trans.add(button_transfer);

        Event_Handler_Transfer event_transfer = new Event_Handler_Transfer(trans, amount_my_acc, amount_to_acc, transfer_amount, button_transfer);
        button_transfer.addActionListener(event_transfer);

        return trans;

    }
    public void actionPerformed(ActionEvent T) {
        String label = ((JButton) T.getSource()).getText();
        String MenuItem = ((JButton) T.getSource()).getText();
        if(label.equals("Now")){
            {
                try{
                    String str = "insert into `transfers` (`Account Number1`  ,  `Account Number2`  ,  `Amount`  ,  `Date` ) values" +
                            "("  +  "'"  +  (amount_my_acc.getText()) +  "'" + "," +  "'" + (amount_to_acc.getText()) + "'" + "," +   transfer_amount.getText()   +  ","   +  "now())";
                    System.out.println(str);
                    Database.stat.executeUpdate(str);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            }

        }


    }
}
