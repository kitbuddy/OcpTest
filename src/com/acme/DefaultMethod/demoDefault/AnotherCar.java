package com.acme.DefaultMethod.demoDefault;

public class AnotherCar implements fourWheeler ,vehicle{
    @Override
    public void print() {
//        vehicle.super.print();
        fourWheeler.super.print();
    }
}
