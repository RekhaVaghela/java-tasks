package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 1;
        int b = 10;
        try {
            for (b = 10; b >= 0; b--) {
                System.out.println(a / b);
            }
        }
        catch(ArithmeticException e ){
            System.out.println("cannot divide by zero");
        }
        System.out.println(b);
        System.out.println("bye");
    }
}
