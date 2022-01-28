package com.acme.FactoryPatternDemo;

public class Male extends FactoryPattern.Person {

        public Male(String name) {
            super(name);
        }

    @Override
    String getSalutation() {
        return "Mr.";
    }
}
