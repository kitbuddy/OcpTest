package StrategyPattern;

public class StrategyPatternDemo {

    static class BubbleSort implements Sortable{

        @Override
        public int[] Sort(int[] numbers) {
            System.out.println("BubbleSort called");
            return new int[0];
        }
    }

    static class QuickSort implements Sortable{

        @Override
        public int[] Sort(int[] numbers) {
            System.out.println("QuickSort called");
            return new int[0];
        }
    }
}
