package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Frame win = new Frame("hello");

        Button b1 = new Button("Click 1");
        Button b2 = new Button("click 2");
        Button b3 = new Button("click 3");
        Button b4 = new Button("click 4");
        Button b5 = new Button("click 5");

        TextField t = new TextField();
        Event2 e = new Event2 (t);

        b1.addActionListener(e);
        b2.addActionListener(e);
        b3.addActionListener(e);
        b4.addActionListener(e);
        b5.addActionListener(e);

        win.add(b1,BorderLayout.NORTH);
        win.add(b2,BorderLayout.EAST);
        win.add(b3,BorderLayout.WEST);
        win.add(b4,BorderLayout.SOUTH);
        win.add(b5,BorderLayout.CENTER);

        win.add(t,BorderLayout.SOUTH);

        win.setVisible(true);
        win.setSize(400, 400);


    }
}
