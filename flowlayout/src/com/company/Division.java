package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Division implements ActionListener {
    TextField T1, T2, T3;

    public Division(TextField a, TextField b, TextField c) {
        T1 = a;
        T2 = b;
        T3 = c;
    }

    public void actionPerformed(ActionEvent T) {
        int no1, no2, no3;
        no1 = Integer.parseInt(T1.getText());
        no2 = Integer.parseInt(T2.getText());
        no3 = no1 / no2;
        T3.setText(Integer.toString(no3));
    }
}


