package com.acme;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringUsingStream {

    public static List<Integer>  printEvenNumbers(List<Integer> numbersList) {

        List<Integer> evenNumbers = numbersList.stream().filter(num -> num%2 == 0).collect(Collectors.toList());

        return evenNumbers;

    }

    public static List<Integer> printOddNumbers(List<Integer> numbersList) {

        List<Integer> oddNumbers = numbersList.stream().filter(num -> num%2 != 0).collect(Collectors.toList());
        return oddNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(FilterStringUsingStream.printEvenNumbers(numbersList));

        System.out.println(FilterStringUsingStream.printOddNumbers(numbersList));
    }


}
