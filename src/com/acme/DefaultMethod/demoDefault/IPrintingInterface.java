package com.acme.DefaultMethod.demoDefault;

public interface IPrintingInterface {

    default void testDefaultPrintInInterface() {
        System.out.println("testDefaultPrintInInterface in IPrintingInterface");
    }

    void testingPrinting();

    static void PrintViaStaticMethod() {
        System.out.println(" static PrintViaStaticMethod from IPrintingInterface" );
    }


}
