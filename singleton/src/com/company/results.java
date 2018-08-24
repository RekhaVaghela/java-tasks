package com.company;

public class results {
    int y;
    static results x;
    static{
        System.out.println("initial");
    }
    private results(int a){
        y = a;
    }
    static results create(int a){
        if(x == null){
            x= new results(a);
        } return x;
    }
}
