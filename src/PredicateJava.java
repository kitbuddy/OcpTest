import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJava {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        // Prints All
        System.out.println("Prints All");
        eval(list, n-> true);
        // Prints even numbers
        System.out.println("\n even numbers");
        eval(list, n-> n % 2 ==0 );
        // Print numbers greater than 2
        System.out.println("\n number greater than 2");
        eval(list, n-> n>2);
    }

    private static void eval(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer i: list) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
