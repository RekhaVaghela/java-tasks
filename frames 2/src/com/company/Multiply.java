package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiply implements ActionListener {
    TextField T1, T2, T3;
    public Multiply(TextField a, TextField b, TextField c){
        T1 = a;
        T2 = b;
        T3 = c;
    }
    public void actionPerformed(ActionEvent T) {
        float no1, no2, no3;
        no1 = Float.parseFloat(T1.getText());
        no2 = Float.parseFloat(T2.getText());
        no3 = no1 * no2;
        T3.setText(Float.toString(no3));
    }

}
