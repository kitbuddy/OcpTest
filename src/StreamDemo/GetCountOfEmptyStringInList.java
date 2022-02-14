package StreamDemo;

import java.util.*;
import java.util.stream.Collectors;

public class GetCountOfEmptyStringInList {

    public static void getEmptyStrCount(List<String> strList) {

        // Non empty string
      List<String> finalResponseNonEmpty = strList.parallelStream().filter(
                a -> a.length() != 0).collect(Collectors.toList());


        System.out.println("Non empty string");
        System.out.println(finalResponseNonEmpty);

        // Non Empty String
       strList.parallelStream()
                            .filter(a -> !a.isEmpty())
                            .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Non Empty String");
        System.out.println(strList);

       // Collect Non-empty string by using "$" sign instead of comma
        String signSepratedList = strList.parallelStream()
                .filter(a -> !a.isEmpty())
                .collect(Collectors.joining("$"));

        System.out.println("Collect Non-empty string by using \"$\" sign instead of comma");
        System.out.println(signSepratedList);


        // Empty String Length
        int emptyStrListSize = strList.parallelStream()
                .filter(a -> a.isEmpty())
                .collect(Collectors.toList()).size();

        System.out.println(" Empty String Length");
        System.out.println("emptyStrListSize : " + emptyStrListSize );

        /* Map<String, Long> resultMap = Stream.concat(map.entrySet().stream(), map1.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (countInFirstMap, countInSecondMap) -> countInFirstMap + countInSecondMap));
*/

        System.out.println(" ----listConverted-----");
        List<String> listConverted = strList.parallelStream().map(String::toLowerCase)
                .filter(x -> x.startsWith("p")).collect(Collectors.toList());

        System.out.println(listConverted);

    }

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("abc", "pq", "PQR", "STW", "", "");
        GetCountOfEmptyStringInList.getEmptyStrCount(strList);
    }

}
