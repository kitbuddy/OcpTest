package FactoryPatternDemo;

public class FactoryPattern {

    public static class PersonFactory {
        public static Person getPerson(String name, String gender) {
            if(gender.equalsIgnoreCase("M")) {
                return new Male(name);
            } else if (gender.equalsIgnoreCase("F")){
                return new Female(name);
            }
            return null;
        }

    }

    static abstract class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

        abstract String getSalutation();

        String getNameAndSalutation() {
            return getSalutation() + " " + name;
        }
    }

    public static void main(String[] args) {
        Person personF = PersonFactory.getPerson("Amanda", "F");
        Person personM = PersonFactory.getPerson("Adam", "M");

        System.out.println(personF.getNameAndSalutation());
        System.out.println(personM.getNameAndSalutation());
    }
}
