package SingletonPatternDemo;

public class SingletonPattern2Class {

    public static SingletonPattern2Class singletonPatternClass;
    private SingletonPattern2Class() {

    }

    static {
        singletonPatternClass = new SingletonPattern2Class();
    }

}

// make constructor private
// make object of class;
// create static {} and initialize object of class.
