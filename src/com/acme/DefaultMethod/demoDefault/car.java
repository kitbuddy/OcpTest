package com.acme.DefaultMethod.demoDefault;

public class car implements fourWheeler, vehicle {
    @Override
    public void print() {
        System.out.println("I am in car print");

        vehicle.blowHorn();
        vehicle.super.print();

        fourWheeler.super.print();

    }

    public static void main(String[] args) {
        car car = new car();

        car.print();
    }
}
