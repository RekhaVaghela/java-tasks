package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;

public class Window extends WindowAdapter {
    Frame f1;
    Frame f2;
    Frame f3;
    Frame f4;
    Frame f5;

    public Window(Frame f1,Frame f2) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;

    }

    public void WindowClosing(WindowEvent we){
        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
    }



}
