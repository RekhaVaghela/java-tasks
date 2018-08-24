package com.company;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;

public class Event2 implements ActionListener {
    TextField T1,T2,T3;
    public void actionPerformed(ActionEvent T){
        String label=((Button) T.getSource()).getLabel();
        if (label.equals("...")) {
            try {
                ResultSet R = database.stat.executeQuery("select * from school where regno=" + T1.getText());
                if (R.next()) {
                    T2.setText(R.getString("Name"));
                    T3.setText(R.getString("Marks"));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        if(label.equals("Delete")){
            try {
                database.stat.executeUpdate("delete from school where regno=" + T1.getText());
                 } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        if(label.equals("Update")){
            try {
                database.stat.executeUpdate("update school set name='"+T2.getText()+"',marks="+T3.getText() + " where regno="+T1.getText());
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        if(label.equals("Save")){
            try {
                String str = "insert into school values(" + T1.getText() + "," + "'" + T2.getText() + "'" + "," + T3.getText() + ")";
                database.stat.executeUpdate(str);
                } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }


    }
    public Event2(TextField a,TextField b,TextField c){
        T1=a;
        T2=b;
        T3=c;
    }
    public Event2(){}
}
