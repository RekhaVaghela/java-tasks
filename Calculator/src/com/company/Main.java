package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Frame f = new Frame("Calculator");

        //Font Fo = new Font(Font.SERIF,Font.BOLD,40);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        //T.setEditable(false);

        p2.setLayout(new GridLayout(4,4));

        Button B0 = new Button ("0");
        Button B1 = new Button ("1");
        Button B2 = new Button ("2");
        Button B3 = new Button ("3");
        Button B4 = new Button ("4");
        Button B5 = new Button ("5");
        Button B6 = new Button ("6");
        Button B7 = new Button ("7");
        Button B8 = new Button ("8");
        Button B9 = new Button ("9");
        Button BC = new Button ("c");
        Button BA = new Button ("+");
        Button BS = new Button ("-");
        Button BM = new Button ("*");
        Button BD = new Button ("/");
        Button BE = new Button ("=");

        p2.add(B0);
        p2.add(B1);
        p2.add(B2);
        p2.add(B3);
        p2.add(B4);
        p2.add(B5);
        p2.add(B6);
        p2.add(B7);
        p2.add(B8);
        p2.add(B9);
        p2.add(BC);
        p2.add(BS);
        p2.add(BM);
        p2.add(BD);
        p2.add(BA);
        p2.add(BE);

        TextField T = new TextField(20);
        p1.add(T);
        f.add(p1,BorderLayout.NORTH);
        f.add(p2);

        Event E = new Event(T);

        B0.addActionListener(E);
        B1.addActionListener(E);
        B2.addActionListener(E);
        B3.addActionListener(E);
        B4.addActionListener(E);
        B5.addActionListener(E);
        B6.addActionListener(E);
        B7.addActionListener(E);
        B8.addActionListener(E);
        B9.addActionListener(E);
        BA.addActionListener(E);
        BS.addActionListener(E);
        BM.addActionListener(E);
        BD.addActionListener(E);
        BC.addActionListener(E);
        BE.addActionListener(E);


        f.setSize(400,400);
        f.setVisible(true);
    }
}
