package com.company;

import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Frame f = new Frame ();
        FlowLayout fl = new FlowLayout();
        TextField T1, T2, T3;
        Label L1, L2, L3;
        L1 = new Label("no1");
        L2 = new Label("no2");
        L3 = new Label("Resolve");
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        Button b1 = new Button(" + ");
        Button b2 = new Button(" - ");
        Button b3 = new Button(" * ");
        Button b4 = new Button(" / ");

        f.setLayout(fl);
        f.add(L1);
        f.add(T1);
        f.add(L2);
        f.add(T2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(L3);
        f.add(T3);

       Event E = new Event(T1, T2, T3, b1, b2, b3, b4);

        Addition E1 = new Addition(T1, T2, T3);
        Subtraction E2 = new Subtraction(T1, T2, T3);
        Multiply E3 = new Multiply(T1, T2, T3);
        Division E4 = new Division(T1, T2, T3);

        b1.addActionListener(E);
        b2.addActionListener(E);
        b3.addActionListener(E);
        b4.addActionListener(E);

        f.setSize(400,400);
        f.setVisible(true);




    }
}
