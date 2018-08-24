package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "HANNAH";
        int a;

        for(a=0;a<=s.length()/2;a++){
            if(s.substring(a, a + 1).equals(s.substring(s.length()-1 - a,s.length() - a)));
            else {
                System.out.println("no");
                break;
            }
            if(a==s.length()/2) {
                 System.out.println("yes");
            }

        }

    }
}
