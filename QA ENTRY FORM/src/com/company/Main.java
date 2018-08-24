package com.company;

import java.awt.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        database.makeconnection();
        Frame f1 = new Frame("Main_Page");
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();

        Frame f2 = new Frame("Entry_Path");
        Panel p4 = new Panel();
        Panel p5 = new Panel();

        Frame f3 = new Frame("Delete_Path");
        Panel p6 = new Panel();
        Panel p7 = new Panel();

        Frame f4 = new Frame("View_Path");
        Panel p8 = new Panel();
        Panel p9 = new Panel();

        Frame f5 = new Frame("Edit_Path");
        Panel p10 = new Panel();
        Panel p11 = new Panel();

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2);
        f1.add(p3, BorderLayout.SOUTH);

        p2.setLayout(new GridLayout(4, 1));
        Button B_ENTRY = new Button("ENTRY");
        Button B_VIEW = new Button("VIEW");
        Button B_EDIT = new Button("EDIT");
        Button B_DELETE = new Button("DELETE");

        p2.add(B_ENTRY);
        p2.add(B_VIEW);
        p2.add(B_EDIT);
        p2.add(B_DELETE);

        Event E_entrypath = new Event(f2,f1);


        f1.setSize(400, 400);
        f1.setVisible(true);

        f2.add(p4, BorderLayout.NORTH);
        f2.add(p5);

        p5.setLayout(new GridLayout(4, 2));
        Label L_RegNo = new Label("RegNo");
        Label L_Name = new Label("Name");
        Label L_Marks = new Label("Marks");

        TextField T_RegNo = new TextField("");
        TextField T_Name = new TextField("");
        TextField T_Marks = new TextField("");

        Label L_Save = new Label("");
        Button B_Save = new Button("SAVE");

        p5.add(L_RegNo);
        p5.add(T_RegNo);
        p5.add(L_Name);
        p5.add(T_Name);
        p5.add(L_Marks);
        p5.add(T_Marks);
        p5.add(L_Save);
        p5.add(B_Save);

        f2.setVisible(false);
        f2.setSize(400, 400);

        p6.setLayout(new GridLayout(1,3));

        Label L_RegNo2 = new Label("RegNo2");
        Label L_Name2 = new Label("Name2");
        Label L_Marks2 = new Label("Marks2");

        TextField T_RegNo2 = new TextField("");
        TextField T_Name2 = new TextField("");
        TextField T_Marks2 = new TextField("");
        Button B_DELETE2 = new Button("DELETE2");
        Button B_DOT = new Button("...");

        p6.add(L_RegNo2);
        p6.add(T_RegNo2);
        p6.add(B_DOT);

        p7.setLayout(new GridLayout(2,2));
        p7.add(L_Name2);
        p7.add(T_Name2);
        p7.add(L_Marks2);
        p7.add(T_Marks2);

        f3.add(p6,BorderLayout.NORTH);
        f3.add(p7);
        f3.add(B_DELETE2,BorderLayout.SOUTH);

        f3.setSize(400,400);
        f3.setVisible(false);

        Label L_RegNo3 = new Label("RegNo3");
        Label L_Name3 = new Label("Name3");
        Label L_Marks3 = new Label("Marks3");
        TextField T_RegNo3 = new TextField("");
        TextField T_Name3 = new TextField("");
        TextField T_Marks3 = new TextField("");
        Button B_CHECKER = new Button("CHECKER");
        Button B_BACK = new Button("BACK");

        p8.setLayout(new GridLayout(1,3));
        p8.add(L_RegNo3);
        p8.add(T_RegNo3);
        p8.add(B_CHECKER);

        p9.setLayout(new GridLayout(2,2));
        p9.add(L_Name3);
        p9.add(T_Name3);
        p9.add(L_Marks3);
        p9.add(T_Marks3);

        f4.add(B_BACK,BorderLayout.SOUTH);
        f4.add(p8,BorderLayout.NORTH);
        f4.add(p9);

        f4.setSize(400,400);
        f4.setVisible(false);



        Label L_RegNo4 = new Label("RegNo4");
        Label L_Name4 = new Label("Name4");
        Label L_Marks4 = new Label("Marks4");
        TextField T_RegNo4 = new TextField("");
        TextField T_Name4 = new TextField("");
        TextField T_Marks4 = new TextField("");
        Button B_CHECK = new Button("CHECK");
        Button B_UPDATE_RECORD = new Button("UPDATE RECORD");

        p10.setLayout(new GridLayout(1,3));
        p10.add(L_RegNo4);
        p10.add(T_RegNo4);
        p10.add(B_CHECK);

        p11.setLayout(new GridLayout(2,2));
        p11.add(L_Name4);
        p11.add(T_Name4);
        p11.add(L_Marks4);
        p11.add(T_Marks4);

        f5.add(B_UPDATE_RECORD,BorderLayout.SOUTH);
        f5.add(p10,BorderLayout.NORTH);
        f5.add(p11);

        f5.setSize(400,400);
        f5.setVisible(false);

        Entry_Input ES = new Entry_Input(f2,f1,f3,f4,f5,
                T_RegNo, T_Name, T_Marks,
                T_RegNo2, T_Name2, T_Marks2,
                T_RegNo3, T_Name3, T_Marks3,
                T_RegNo4, T_Name4, T_Marks4);

        B_ENTRY.addActionListener(ES);
        B_Save.addActionListener(ES);
        B_DELETE.addActionListener(ES);
        B_DELETE2.addActionListener(ES);
        B_DOT.addActionListener(ES);
        B_VIEW.addActionListener(ES);
        B_CHECKER.addActionListener(ES);
        B_BACK.addActionListener(ES);
        B_EDIT.addActionListener(ES);
        B_CHECK.addActionListener(ES);
        B_UPDATE_RECORD.addActionListener(ES);



    }




}
