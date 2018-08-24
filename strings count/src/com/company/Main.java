package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str ="mary had a little lamb";
        int results = 0;
        for (int a=0; a<str.length(); a++){
            String z = str.substring(a, a+1);
            if (z.equals("m")){
                results ++;
            }
        } System.out.println(results);
    }
}
