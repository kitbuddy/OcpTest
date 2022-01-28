import com.acme.FilterStringUsingStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsTesting {

    public static void printrandomNumbers() {
//        System.out.println();

        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);

        random.ints(10).sequential().limit(10).forEach(System.out::println);
    }

    public static List<Integer> printSquareMap(List<Integer> numbers) {
        List<Integer> squaredList = numbers.stream().map(num -> num * num).distinct().collect(Collectors.toList());

        numbers.stream().map(num -> num * num).distinct().collect(Collectors.toList()).stream().forEach(System.out::print);

        return squaredList;
    }

    public static List<Boolean> printListOfString(List<String> stringList) {

        List<Boolean> mapByA = stringList.stream().map(a -> a.contains("p")).collect(Collectors.toList());

        return mapByA;
    }

    public static List<String> printListOfStringSorted(List<String> stringList) {

        List<String> mapByA = stringList.stream().filter(a -> a.contains("r")).collect(Collectors.toList());

        return mapByA;
    }

    public static List<String> printListOfStringContainsA(List<String> stringList) {

        List<String> filteredByAList = stringList.stream().filter(a -> a.contains("a")).collect(Collectors.toList());

        return filteredByAList;
    }


    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> numbersList2 = Arrays.asList(11, 22, 31, 41, 51212, 61212, 71212, 82, 92, 01212);
        List<String> stringList = Arrays.asList("red", "orange", "pink", "black" );

//        StreamsTesting.printrandomNumbers();
        System.out.println(StreamsTesting.printSquareMap(numbersList));
        System.out.println(StreamsTesting.printListOfString(stringList));

        System.out.println(StreamsTesting.printListOfStringContainsA(stringList));
        System.out.println(StreamsTesting.printListOfStringSorted(stringList));
    }
}
