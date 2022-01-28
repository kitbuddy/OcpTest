package StreamDemo;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummary {

    IntSummaryStatistics statictics = IntStream.of(1,2,3,4,5,6,7,8,9,10).summaryStatistics();

    public static void main(String[] args) {
        IntSummary intSummary = new IntSummary();
        System.out.println(intSummary.statictics);
    }
}
