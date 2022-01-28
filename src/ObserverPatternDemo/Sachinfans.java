package ObserverPatternDemo;

public class Sachinfans {

    String name;

    public Sachinfans(String name) {
        this.name = name;
    }

    public void announce() {
        System.out.println("Notified to: => " + name);
    }
}
