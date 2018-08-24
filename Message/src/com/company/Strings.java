package com.company;

import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;

public class Strings {
    public void count(String msg, String What)
    {
        int i, num;
        i = num = 0;
        for (; i < msg.length(); i++)
        {
            String alpha;
            alpha = msg.substring(i, i+2);
            if (alpha.equals(What))
            {
                num++;
            }
        }
        System.out.println("There is/are " + num + " " + What);
    }

    public void countWord(String msg, String What)
    {
        int i, num;
        i = num = 0;
        for (; i <= msg.length() - What.length(); i++)
        {
            String alpha;
            alpha = msg.substring(i, i+What.length());
            if (alpha.equals(What))
            {
                num++;
            }
        }
        System.out.println("There is/are " + num + " " + What);

    }

    public void wordDesc(String msg)
    {
        int i;
        String s=" ";
        String t ="";
        for(i=msg.length()-1; i >= 0; i--)
        {
            String alpha;
            alpha = msg.substring(i, i+1);
            if (alpha.equals(s))
            {
                System.out.println(t);
                t ="";
            }
            else
            {
                t = alpha + t;
            }
        }
        System.out.println(t);
    }

    public void replace(String msg, String What, String replace)
    {
        int i, num;
        i =num = 0;
        String t ="";
        String s="";
        for (; i <= msg.length() - What.length(); i++)
        {
            String alpha;
            alpha = msg.substring(i, i+What.length());
            if (alpha.equals(What))
            {
                System.out.println("Message: "+msg);
                System.out.println("In message: Replace " + "'" + What + "'"+ " with " + "'" + replace + "'");
                System.out.println();
                System.out.println("New message: " + msg.substring(0,i) + replace + msg.substring(i + replace.length(), msg.length()));
//                System.out.println("New message: " + msg.substring(0,i) + replace);
//                replace(msg.substring(i + replace.length(), msg.length()), What, replace);
            }
        }
    }

    public String decbin(int i)
    {
        String s = "";

        while (i!=1)
        {
            s=i%2+s+" ";
            i=i/2;
        }
        s=1+s;
        return s;
    }

    public int bindec(String w)
    {
        int i;
        int num =0;
        for (i=w.length() - 1; i >= 0; i--)
        {
            if(w.substring(i, i + 1).equals("1"))
            {
                num = num + power(w.length() - i);
            }
        }
        return num;
    }

    public int power(int n)
    {
        int i;
        int m = 1;
        for(i=1; i<=n;i++)
        {
            m = m * 2;
        }
        return m;
    }
}