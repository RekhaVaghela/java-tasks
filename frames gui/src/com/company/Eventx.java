package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Eventx implements ActionListener{
    int y = 0;
    public void actionPerformed(ActionEvent x){
        System.out.println("Button Clicked");
        y++;
        if(y > 2) System.out.println("you love to click");
    }
}

