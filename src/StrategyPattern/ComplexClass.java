package StrategyPattern;

public class ComplexClass {

    Sortable sortable;

    ComplexClass(Sortable sortable) {

        this.sortable = sortable;
    }

    void doComplexThings() {
        int[] values = null;

        System.out.println("doComplexThings is called");
        sortable.Sort(values);

    }

    public static void main(String[] args) {
        ComplexClass complexClass = new ComplexClass(new StrategyPatternDemo.QuickSort());

        complexClass.doComplexThings();
    }
}
