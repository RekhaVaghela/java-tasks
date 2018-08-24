package com.company;

public class Accounts {
    public void CalculateSalary(int Salary, int Absenties) throws Boom{
        float net = 0;
        if (Absenties>8){
            Boom abc = new Boom ();
            throw abc;
        }
    }
}
