package com.acme.DefaultMethod.demoDefault;

public interface fourWheeler {

    default void print() {
        System.out.println("print Interface from four wheeler");
    }
}


