package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetCountOfEmptyStringInList {

    public static void getEmptyStrCount(List<String> strList) {

        // Non empty string
      List<String> finalResponseNonEmpty = strList.parallelStream().filter(
                a -> a.length() != 0).collect(Collectors.toList());

        System.out.println(finalResponseNonEmpty);

        // Non Empty String
       strList.parallelStream()
                            .filter(a -> !a.isEmpty())
                            .collect(Collectors.toList()).forEach(System.out::println);

        // Empty String Length
        int emptyStrListSize = strList.parallelStream()
                .filter(a -> a.isEmpty())
                .collect(Collectors.toList()).size();

        System.out.println("emptyStrListSize : " + emptyStrListSize );
    }

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("abc", "pq", "PQR", "STW", "", "");
        GetCountOfEmptyStringInList.getEmptyStrCount(strList);
    }

}
