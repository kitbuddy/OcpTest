import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class loopArrayHop {

    public static void main(String[] args) {
        int n = 7;

        int sets = 0;
        List<Integer> ar = Arrays.asList(1, 2, 1, 2, 1, 3, 2);

            Collections.sort(ar);
        for (int i = 0; i < n-1; i++) {
            if(ar.get(i) == ar.get(i+1)) {
                System.out.println("i is: " + i);
                System.out.println(ar.get(i) + " & " + ar.get(i+1));
                sets = sets +1;
                i++;
            }
        }
        System.out.println(sets);

        }
}
