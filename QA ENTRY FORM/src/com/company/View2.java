package com.company;
import java.awt.*;
import java.awt.event.*;

public class View2 {
    static Panel P;
    Frame Entry_frm;
    Event2 eventH;
    public View2(){
        Entry_frm=new Frame("Data View");
        P=new Panel(new GridLayout(3,3));
        TextField regno_txt,name_txt,marks_txt;
        Button search_btn=new Button("...");
        regno_txt=new TextField();
        name_txt=new TextField();
        marks_txt=new TextField();
        P.add(new Label("Regno:"));
        P.add(regno_txt);
        P.add(search_btn);
        P.add(new Label("Name:"));
        P.add(name_txt);
        P.add(new Label());
        P.add(new Label("Marks"));
        eventH=new Event2(regno_txt,name_txt,marks_txt);
        P.add(marks_txt);
        Entry_frm.add(P);

        search_btn.addActionListener(eventH);
    }
    public void Show_view(){
        Entry_frm.setSize(400,400);
        Entry_frm.setVisible(true);
    }
    public void Show_Delete(){
        Frame delete_frm=new Frame("deletinggggggggggggggggggg");
        Button del=new Button("Delete");
        del.addActionListener(eventH);
        delete_frm.add(View2.P);
        delete_frm.setSize(400,400);
        delete_frm.add(del,BorderLayout.SOUTH);
        delete_frm.setVisible(true);
    }
    public void Show_Edit(){
        Frame edit_frm=new Frame("Editing");
        Button edit=new Button("Update");
        edit.addActionListener(eventH);
        edit_frm.add(View2.P);
        edit_frm.setSize(400,400);
        edit_frm.add(edit,BorderLayout.SOUTH);
        edit_frm.setVisible(true);
    }

    public void Show_entry(){
        Frame entry_frm=new Frame("Entry");
        Button insert=new Button("Save");
        insert.addActionListener(eventH);
        entry_frm.add(View2.P);
        entry_frm.setSize(400,400);
        entry_frm.add(insert,BorderLayout.SOUTH);
        entry_frm.setVisible(true);
    }

}
