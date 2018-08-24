package com.company;

import javax.print.attribute.IntegerSyntax;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main2 {
    public String str;
    static JTextField t1,t2,t_Results;
    public static void main(String[] args) {

        // write your code here
        JFrame f = new JFrame("HELLO");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Op 1");
        JMenu m2 = new JMenu("Op 2");

        JMenuItem addition = new JMenuItem("Addition");
        JMenuItem subtraction = new JMenuItem("Subtraction");
        JMenuItem multiply = new JMenuItem("Multiply");
        JMenuItem division = new JMenuItem("Division");

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));
        JLabel l1 = new JLabel("No1");
        JLabel l2 = new JLabel("No2");
        JLabel l_Result = new JLabel("Result");
        t1 = new JTextField("");
        t2 = new JTextField("");
        t_Results = new JTextField("");

        mb.add(m1);
        mb.add(m2);

        m1.add(addition);
        m1.add(subtraction);
        m1.add(multiply);
        m1.add(division);

        f.setJMenuBar(mb);
        f.add(p1);

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l_Result);
        p1.add(t_Results);

        f.setVisible(true);
        t_Results.setEditable(false);
        f.setSize(400, 400);

        addition.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                calculations(1);
            }
        });
        subtraction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculations(2);
            }
        });
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculations(3);
            }
        });
        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculations(4);
            }
        });

    }
        private static void calculations(int choice){
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());
        int C=0;
            if (choice==1) C=i+j;
            if (choice==2) C=i-j;
            if (choice==3) C=i*j;
            if (choice==4) C=i/j;
            t_Results.setText("...."+Integer.toString(C));
    }
}
