package SingletonPatternDemo;

public class SingletonPattern3Class {

        private static SingletonPattern3Class singletonPattern3ClassInstance;

        public String s;

        private SingletonPattern3Class() {
                s = "Test String";
        }

        public static SingletonPattern3Class getInstance() {

            if (singletonPattern3ClassInstance == null ){
                singletonPattern3ClassInstance = new SingletonPattern3Class();
            }

            return singletonPattern3ClassInstance;
        }


    public static void main(String[] args) {
        SingletonPattern3Class singletonPattern3Class = SingletonPattern3Class.getInstance();
        SingletonPattern3Class singletonPattern3Class2 = SingletonPattern3Class.getInstance();
        SingletonPattern3Class singletonPattern3Class3 = SingletonPattern3Class.getInstance();

        System.out.println(singletonPattern3Class.hashCode());
        System.out.println(singletonPattern3Class2.hashCode());
        System.out.println(singletonPattern3Class3.hashCode());

        if(singletonPattern3Class == singletonPattern3Class2
                && singletonPattern3Class2 == singletonPattern3Class3) {
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }



    }
}
