package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Circle c = new Circle ();
        dodrawing (c);
        Line l = new Line ();
        dodrawing (l);


    }
    public static void dodrawing(Draw D){
        D.drawing();
    }


}
