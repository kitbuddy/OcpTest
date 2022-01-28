package com.acme.FactoryPatternDemo;

public class Female extends FactoryPattern.Person {
    public Female(String name) {
        super(name);
    }

    @Override
    String getSalutation() {
        return "Miss/Mrs";
    }

}
