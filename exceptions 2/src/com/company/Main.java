package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        int b;
        try {
           a = Integer.parseInt(args[-2]);
           b = Integer.parseInt(args[56]);
            System.out.println(a * b);
        }
        catch(ArithmeticException x ){
            System.out.println("cant divide by 0");
        }
        catch(NumberFormatException x){
            System.out.println("need to insert number");
        }
        catch(IndexOutOfBoundsException x){
            System.out.println("at least two numbers required");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
