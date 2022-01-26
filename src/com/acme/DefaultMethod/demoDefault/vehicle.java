package com.acme.DefaultMethod.demoDefault;

public interface vehicle {
    default void print() {
        System.out.println("Printing Interface default from vehicle");
    }

    static void blowHorn() {
        System.out.println("I am in static Interface blow horn method");
    }
}
