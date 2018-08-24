package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] animals = new int[4][3];
        animals[0][0] = 1;
        animals[0][1] = 2;
        animals[0][2] = 3;
        animals[1][0] = 4;
        animals[1][1] = 5;
        animals[1][2] = 6;
        animals[2][0] = 7;
        animals[2][1] = 8;
        animals[2][2] = 9;
        animals[3][0] = 10;
        animals[3][1] = 11;
        animals[3][2] = 12;
        int i;
        int j;
        int sum = 0;
        for(i=0;i<=3;i++){
            for(j=0;j<=2;j++) {
                sum = sum + animals [i][j];
            }
        }
        System.out.println(sum);


    }
}
