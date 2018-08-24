package com.company;

import java.awt.*;
import java.awt.event.*;

public class Event implements ActionListener{
    TextField T1, T2, T3;
    Button BA,BS,BM,BD;

    public Event( TextField T1,
                          TextField T2,
                          TextField T3,
                          Button b1,
                          Button b2,
                          Button b3,
                          Button b4){
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
        BA = b1;
        BS = b2;
        BM = b3;
        BD = b4;
    }

    public void actionPerformed(ActionEvent x){
        int no1,no2,no3;
        no1 = Integer.parseInt(T1.getText());
        no2 = Integer.parseInt(T2.getText());
        Button btn = (Button)x.getSource();

        String what = btn.getLabel();
        if(what.equals(" + "));

        if (btn == BA){
            no3 = no1 + no2;
        }
        if (btn ==BS){
            no3 = no1 - no2;
        }
        if(btn == BM){
            no3 = no1 * no2;
        }
        if(btn == BD){
            no3 = no1 / no2;
        }
    }

}

