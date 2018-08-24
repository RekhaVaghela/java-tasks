package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Accounts Peter = new Accounts();
            try {
                Peter.CalculateSalary(1500, 12);
            }  catch(Boom abc) {
                System.out.println("you are fired");
            }


    }
}
