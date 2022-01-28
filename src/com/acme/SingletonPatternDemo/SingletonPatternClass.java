package com.acme.SingletonPatternDemo;

public class SingletonPatternClass {

    private static final SingletonPatternClass SINGLETON_PATTERN_CLASS_OBJ = new SingletonPatternClass();

    private SingletonPatternClass() {
    }

    public static SingletonPatternClass getSINGLETON_PATTERN_CLASS_OBJ() {
        return SINGLETON_PATTERN_CLASS_OBJ;

    }
}


//  make constructor private
// create object and initialize it
// create getter to return object;
