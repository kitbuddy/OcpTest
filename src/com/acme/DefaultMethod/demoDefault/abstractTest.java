package com.acme.DefaultMethod.demoDefault;


class PrintViaAbstractClass extends testPrint{

    @Override
    public void PrintAbstractMethod() {
        System.out.println(" printing PrintAbstractMethod via PrintViaAbstractClass ");
    }

    /*@Override
    public void printName() {
        System.out.println(" the printName method is overridden in PrintViaAbstractClass");
    }*/
}

public class abstractTest {

    public static void main(String[] args) {
        PrintViaAbstractClass printViaAbstractClass = new PrintViaAbstractClass();
        printViaAbstractClass.name = "name Prints here";
        printViaAbstractClass.printName(); // used hidden non-abstract method and non-abstract model
        printViaAbstractClass.PrintAbstractMethod();
    }
}
