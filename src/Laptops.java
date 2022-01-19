import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Builder
@Getter
@ToString
public class Laptops {

    private String name;
    private int id;
    private Double price;

    public static void main(String[] args) {

        Laptops lap1 = Laptops.builder().id(1).name("lap1").price(1D).build();

        List<Laptops> list1 = new ArrayList<>();

        list1.add(Laptops.builder().id(1).name("l1").price(100D).build());
        list1.add(Laptops.builder().id(2).name("l2").price(12D).build());
        list1.add(Laptops.builder().id(3).name("l3").price(32D).build());
        System.out.println(list1);

        Comparator<Laptops> comparator = (o1, o2) -> {
            if(o1.getPrice() < o2.getPrice()) {
                return 1;
            } else {
                return -1;
            }
        };

        Collections.sort(list1, comparator);

        System.out.println("After Sorting");
        list1.stream().forEach(a -> {
            System.out.println(a);
        });
    }
}
