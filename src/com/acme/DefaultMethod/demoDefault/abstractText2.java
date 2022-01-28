package com.acme.DefaultMethod.demoDefault;

public class abstractText2 extends testPrint{

    @Override
    public void PrintAbstractMethod() {
        System.out.println("PrintAbstractMethod called from abstractText2 ");
    }


    public static void main(String[] args) {
        abstractTest abstractTest = new abstractTest();
        abstractText2 abstractText2 = new abstractText2();
        abstractText2.name = "New name in abstract Text2";

        abstractText2.printName();
        abstractText2.PrintAbstractMethod();
    }
}
