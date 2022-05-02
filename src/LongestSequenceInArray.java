import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSequenceInArray {

    public static void main(String[] args) {
        int integerList[] = {1, 4, 2, 5, 6, 11, 22, 23, 3};

//        LongestSequenceInArray.getLongestArraySequence(integerList);
        System.out.println(LongestSequenceInArray.getLongestArraySequence2(integerList));
    }

    public static void getLongestArraySequence(int[] integerList) {
        Arrays.sort(integerList);

        int count = 0;
        int ans = 0;
        ArrayList<Integer> integerListTOCHECK = new ArrayList<>();
        integerListTOCHECK.add(integerList[0]);

        // removing repeated numbers
        for (int i = 1; i < integerList.length; i++) {
            if (integerList[i] != integerList[i - 1])
                integerListTOCHECK.add(integerList[i]);
        }


        System.out.println(integerListTOCHECK);
        for (int i = 0; i < integerListTOCHECK.size(); i++) {
            if (i > 0 && integerListTOCHECK.get(i) == integerListTOCHECK.get(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }

        System.out.println("ans : " + ans);
        System.out.println("count : " + count);

        System.out.println("Longest Sequence list length: " + ans);

    }

    private static int getLongestArraySequence2(int[] integerList) {
        int longestSequenceSize = 0;
        int count =0;
        List<Integer> integerListSequenced = Arrays.stream(integerList).sequential().sorted().boxed().collect(Collectors.toList());

        System.out.println(integerListSequenced);
        if (integerListSequenced.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < integerListSequenced.size(); i++) {
            if (i>0 && integerListSequenced.get(i) == (integerListSequenced.get(i - 1)) + 1) {
                count++;
            } else {
                count = 1;
            }
             longestSequenceSize = Math.max(longestSequenceSize, count);
            }

        return longestSequenceSize;
    }

}
