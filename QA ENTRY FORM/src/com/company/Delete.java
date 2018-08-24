package com.company;
import java.awt.*;
public class Delete {

    public Delete(){
        Frame delete_frm=new Frame("deletinggggggggggggggggggg");
        Button del=new Button("Delete");
        del.addActionListener(new Event2());
        delete_frm.add(View2.P);
        delete_frm.setSize(400,400);
        delete_frm.add(del,BorderLayout.SOUTH);
        delete_frm.setVisible(true);

    }
}
