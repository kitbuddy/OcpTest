import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotationArray {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

//        Collections.rotate(a, a.size()-d);

        for (int k = 0; k < d; k++) {


            int i, temp;
            temp = a.get(0);
            for (i = 0; i < a.size() - 1; i++)
                a.set(i, a.get(i + 1));
            a.set(a.size() - 1, temp);

        }
         return a;
    }

    public static void main(String[] args) {
        System.out.println(LeftRotationArray.rotLeft(Arrays.asList(1, 2, 3, 4, 5), 4));
    }
}
