package com.acme.lab07;

import com.acme.utils.MyDate;

public class AcmeOrderSystem {

    static void passObject(MyDate myDate) {
        myDate.year = 2009;
    }

    public static void passPrimitive(int i){
        i=2010;
    }


    static void passString(String s) {
        int yearSlash = s.lastIndexOf("/");
        s = s.substring(0, yearSlash+1);
        s += 2012;

        System.out.println("new Date String: " + s);
    }

    static void passStringBuffer(StringBuilder s) {
        int yearSlash = s.lastIndexOf("/");
        s = new StringBuilder(s.substring(0, yearSlash + 1));
        s.append(2012);

        System.out.println("new Date String: " + s);
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(1,20,2008);

        System.out.println("Before passing an object " + date);
        passObject(date);
        System.out.println("After passing an object " + date);

        System.out.println("------------------");
        System.out.println("Before passing a primitive " + date.year);
        passPrimitive(date.year);
        System.out.println("After passing a primitive " + date.year);

        System.out.println("------------------");
        String x = date.toString();
        System.out.println("Before passing a String " + x);
        passString(x);
        System.out.println("After passing a String " + x);

        System.out.println("------------------");
        String y = date.toString();
        System.out.println("Before passing a StringBuilder " + x);
        passString(y);
        System.out.println("After passing a StringBuilder " + x);
    }
}
