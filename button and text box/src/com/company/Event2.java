package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Event2 implements ActionListener {
        TextField txt;
        public Event2(TextField t){
            txt=t;
        }
        public void actionPerformed(ActionEvent x){
            txt.setText("HELLO MY FRIENDS");
        }


}
