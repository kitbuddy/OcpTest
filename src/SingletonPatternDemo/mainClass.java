package SingletonPatternDemo;

public class mainClass {


    public static void main(String[] args) {
        SingletonPatternClass singletonPatternClass = SingletonPatternClass.getSINGLETON_PATTERN_CLASS_OBJ();
        SingletonPatternClass singletonPatternClass2 = SingletonPatternClass.getSINGLETON_PATTERN_CLASS_OBJ();

        System.out.println(singletonPatternClass.hashCode());
        System.out.println(singletonPatternClass2.hashCode());

        System.out.println("----------SingletonPattern2Class--------");
        SingletonPattern2Class singletonPattern2Class = SingletonPattern2Class.singletonPattern2ClassObj;
        SingletonPattern2Class singletonPattern2Class2 = SingletonPattern2Class.singletonPattern2ClassObj;

        System.out.println(singletonPattern2Class.hashCode());
        System.out.println(singletonPattern2Class2.hashCode());
    }
}
