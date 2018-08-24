package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener {

    TextField T;
    int result;
    int input_number;

    String input = "";
    String lastopp = "+";
    String label;

    public Event(TextField T) {
        this.T = T;
    }

    public void actionPerformed(ActionEvent E) {
        String label = ((Button) E.getSource()).getLabel();
        if ((label.compareTo("0") >= 0) && (label.compareTo("9") <= 0)) {
            input += label;
            T.setText(input);
            return;
        }
        if (label.equals("c")) {
            input = "";
            lastopp = "+";
            result = 0;
            T.setText(Integer.toString(result));
            return;
        }
        if (label.equals("=")) {
            Checker();
            T.setText(Integer.toString(result));
            return;
        }
        Checker();
        lastopp = label;
    }

    public void Checker (){

        try {
            input_number = Integer.parseInt(input);
            input = "";

            switch (lastopp) {

                case "+":
                    result += input_number;
                    break;

                case "-":
                    result -= input_number;
                    break;

                case "*":
                    result *= input_number;
                    break;

                case "/":
                    result /= input_number;
                    break;
            }
        }
        catch (NumberFormatException e){
            System.out.println("insert number");
        }
        catch(ArithmeticException e) {
            System.out.println("cant divide by 0" );
        }
        catch(Exception e){
            System.out.println("error");
        }
    }

}
