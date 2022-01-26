package com.acme.DefaultMethod.demoDefault;

public interface IPrintingInterface {

    public default void testDefaultPrintInInterface() {
        System.out.println("testDefaultPrintInInterface in IPrintingInterface");
    }

    public void testingPrinting();
}
