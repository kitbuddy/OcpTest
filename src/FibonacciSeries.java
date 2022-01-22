import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public static int fibonacci(int n) {

        List<Integer> integersArrayList = new ArrayList<>(30);

        integersArrayList.add(0, 0);
        integersArrayList.add(1,1);

        for (int i =0; i <= 30; i++) {
            if(i>1) {
                integersArrayList.add(i, integersArrayList.get(i-1) + integersArrayList.get(i-2));
            }
        }

        System.out.println( integersArrayList.get(n));
        return integersArrayList.get(n);
        // Complete the function.
    }

    public static void main(String[] args) {
        FibonacciSeries.fibonacci(3);
    }

}
