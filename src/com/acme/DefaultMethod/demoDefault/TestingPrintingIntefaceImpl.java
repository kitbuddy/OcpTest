package com.acme.DefaultMethod.demoDefault;

public class TestingPrintingIntefaceImpl implements IPrintingInterface{
    @Override
    public void testingPrinting() {
        System.out.println( "This is printing via TestingPrintingIntefaceImpl");
    }

    public static void main(String[] args) {
        TestingPrintingIntefaceImpl testingPrintingInteface = new TestingPrintingIntefaceImpl();

        testingPrintingInteface.testDefaultPrintInInterface();
        testingPrintingInteface.testingPrinting();
    }
}
