package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Event implements ActionListener{

    Frame f2;
    Frame f1;

    public Event(Frame f2, Frame f1) {
        this.f2 = f2;
        this.f1 = f1;
    }

    public void actionPerformed (ActionEvent E){
        String label = ((Button)E.getSource()).getLabel();
        if(label.equals("ENTRY")){
          //  f2.setVisible(true);
          //  f1.setVisible(false);
          //  new Entry2();
        }

        if(label.equals("DELETE")){

        }

        if(label.equals("VIEW")){

        }

        if(label.equals("EDIT")){

        }




}
}
