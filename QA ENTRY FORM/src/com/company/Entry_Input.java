package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.ActionListener;

public class Entry_Input implements ActionListener {
    TextField T_RegNo;
    TextField T_Name;
    TextField T_Marks;
    TextField T_RegNo2;
    TextField T_Name2;
    TextField T_Marks2;
    TextField T_RegNo3;
    TextField T_Name3;
    TextField T_Marks3;
    TextField T_RegNo4;
    TextField T_Name4;
    TextField T_Marks4;
    Frame f1;
    Frame f2;
    Frame f3;
    Frame f4;
    Frame f5;
    View2 V=new View2();


    public Entry_Input(Frame f2, Frame f1, Frame f3,Frame f4, Frame f5,
                       TextField T_RegNo, TextField T_Name, TextField T_Marks,
                       TextField T_RegNo2, TextField T_Name2, TextField T_Marks2,
                       TextField T_RegNo3, TextField T_Name3, TextField T_Marks3,
                       TextField T_RegNo4, TextField T_Name4, TextField T_Marks4) {
        this.f2 = f2;
        this.f1 = f1;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
        this.T_RegNo = T_RegNo;
        this.T_Name = T_Name;
        this.T_Marks = T_Marks;
        this.T_RegNo2 = T_RegNo2;
        this.T_Name2 = T_Name2;
        this.T_Marks2 = T_Marks2;
        this.T_RegNo3 = T_RegNo3;
        this.T_Name3 = T_Name3;
        this.T_Marks3 = T_Marks3;
        this.T_RegNo4 = T_RegNo4;
        this.T_Name4 = T_Name4;
        this.T_Marks4 = T_Marks4;

    }

    public void actionPerformed(ActionEvent E) {
        String label = ((Button) E.getSource()).getLabel();

        if(label.equals("ENTRY")) {
          V.Show_entry();

        }

        if(label.equals("SAVE")) {
            {
                try {
                    String str = "insert into school values(" + T_RegNo.getText() + "," + "'" + T_Name.getText() + "'" + "," + T_Marks.getText() + ")";
                    database.stat.executeUpdate(str);

                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }
            }
            f2.setVisible(false);
            f1.setVisible(true);

        }

        if(label.equals("DELETE")){
           // f1.setVisible(false);
           // f3.setVisible(true);
            V.Show_Delete();
        }

        if(label.equals("DELETE2")) {
            {
                try {
                    String str = "delete from school where RegNo = " + T_RegNo2.getText();
                    database.stat.executeUpdate(str);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            f1.setVisible(true);
            f2.setVisible(false);
            f3.setVisible(false);
        }

        if(label.equals("...")){
            {
                try {
                ResultSet R = database.stat.executeQuery("select * from school");
                while(R.next()) {
                    if (Integer.parseInt(T_RegNo2.getText()) == R.getInt("RegNo")) {
                        T_Name2.setText( R.getString("Name"));
                        T_Marks2.setText(R.getString("Marks"));
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }

        }

        if(label.equals("VIEW")){
          //  f4.setVisible(true);
          //  f3.setVisible(false);
          //  f2.setVisible(false);
          //  f1.setVisible(false);
            V.Show_view();
        }

        if(label.equals("CHECKER")){
            {
                try {

                    ResultSet R = database.stat.executeQuery("select * from school");
                    while(R.next()) {
                        if (Integer.parseInt(T_RegNo3.getText()) == R.getInt("RegNo")) {
                            T_Name3.setText( R.getString("Name"));
                            T_Marks3.setText(R.getString("Marks"));
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }

            }
        }

        if(label.equals("BACK")){
            f4.setVisible(false);
            f3.setVisible(false);
            f2.setVisible(false);
            f1.setVisible(true);
        }

        if(label.equals("EDIT")){
        //    f5.setVisible(true);
         //   f4.setVisible(false);
        //    f3.setVisible(false);
        //    f2.setVisible(false);
         //   f1.setVisible(false);
            V.Show_Edit();
        }

        if(label.equals("CHECK")){
            {
                try {

                    ResultSet R = database.stat.executeQuery("select * from school");
                    while(R.next()) {
                        if (Integer.parseInt(T_RegNo4.getText()) == R.getInt("RegNo")) {
                            T_Name4.setText( R.getString("Name"));
                            T_Marks4.setText(R.getString("Marks"));
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }

            }

        }

        if(label.equals("UPDATE RECORD")){
            try {
                String str = "update school set Marks = " + T_Marks4.getText() + ", Name = " + "'" + T_Name4.getText() + "'" + " where regno =" + T_RegNo4.getText();
                System.out.println(str);
                database.stat.executeUpdate(str);

            } catch (Exception e) {

            }
            f5.setVisible(false);
            f4.setVisible(false);
            f3.setVisible(false);
            f2.setVisible(false);
            f1.setVisible(true);

    }
    }
}
