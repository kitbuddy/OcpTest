import java.util.ArrayList;
import java.util.Collections;
/*
So comparable interface let us chnage the compareTo method for the particular class,
means Collections.sort method uses compareTo method internally, so when we change the compareTo method via Comparable Interface
it internally changes the logic for comparison for Collections.sort method for that class.
* */
public class comparableClass implements Comparable<comparableClass>{

    private String name;
    private int Id;

    comparableClass(String name, int Id) {
        this.Id = Id;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public int compareTo(comparableClass o) {
        if(this.getId() == o.getId()) {
            return 0;
        } else if (this.getId() < o.getId()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        comparableClass c1 = new comparableClass("Ankit", 21);
        comparableClass c2 = new comparableClass("Ankit2", 12);
        comparableClass c3 = new comparableClass("Ankit3", 33);
        comparableClass c4 = new comparableClass("Ankit4", 4);

        ArrayList<comparableClass> arrayList = new ArrayList<>();
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        arrayList.add(c4);

        Collections.sort(arrayList);

        arrayList.forEach(a -> System.out.println(a.Id));
    }
}
