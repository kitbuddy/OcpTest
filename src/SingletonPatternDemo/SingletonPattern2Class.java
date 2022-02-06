package SingletonPatternDemo;

public class SingletonPattern2Class {

    public static SingletonPattern2Class singletonPattern2ClassObj;
    private SingletonPattern2Class() {

    }

    static {
        singletonPattern2ClassObj = new SingletonPattern2Class();
    }

}

// make constructor private
// make object of class;
// create static {} and initialize object of class.
