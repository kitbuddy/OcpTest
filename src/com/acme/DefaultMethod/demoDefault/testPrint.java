package com.acme.DefaultMethod.demoDefault;

abstract class testPrint {

    String name;

    public void printName() {
        System.out.println("this is to print name via abstract class: ->" + name);
    }

    public abstract void PrintAbstractMethod();
}
