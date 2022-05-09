import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTest {



    public static void main(String[] args) {
        JavaTest.outputAnswer();
    }

    private static void outputAnswer() {

        List<String> testArray = new ArrayList<>();

        for (int i = 0; i <20; i++) {
            testArray.add(i, "Example" + i);
        }

        List<String> outArray = testArray.stream().filter(a -> a.equals("Example5")).collect(Collectors.toList());
        System.out.println(outArray);


    }

}
