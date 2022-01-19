package com.acme.utils;

import com.oracle.net.Sdp;

public class MyDate {

    public int day;
    public int year;
    public int month;

    public MyDate(int day, int year, int month) {
        setDate(day, year, month);
    }

    public MyDate() {
    }

    @Override
    public String toString() {
        return  month + "/" + day + "/" + year;
    }

    public void setDate(int m, int d, int y) {
        day = d;
        month = m;
        year = y;
    }
}
