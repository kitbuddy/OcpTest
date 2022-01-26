package com.acme.DefaultMethod.demoDefault;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAP12Binding;

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
