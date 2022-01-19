import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class AssessmentXxxviii {
//    private static Executors Executers;
//
//    public static void await(CyclicBarrier cb) {
//        try {
//            cb.await();
//        }catch (InterruptedException | BrokenBarrierException e) {
//            // Handles Exception
//        }
//    }
//
//    public static void main(String[] args) {
//        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean"));
//
//        ExecuterService executerService = Executers.newScheduledThreadPool(2);
//
//        IntStream.iterate(1, i-> 1).limit(12).forEach(i -> executerService.submit(
//                () -> await(cb)));
//
//        executerService.shutdown();
//    }
}
