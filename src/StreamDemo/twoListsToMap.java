package StreamDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class twoListsToMap {

    // output {(a1,p1)}
    public static Map<String, String> ListsMergedToMap() {
        List<String> list1 = Arrays.asList("a11", "b21", "c3");
        List<String> list2 = Arrays.asList("p1", "q2", "r3");

//        Map<String, String> mapResult = new HashMap<>();
        Map<String, String> mapResult = new LinkedHashMap<>();

       /* List<String[]> result1 = list1.stream()
                .map(x -> x.split(", "))
                .collect(Collectors.toList());

        result1.stream()
                .forEach( a -> Arrays.stream(a).filter(b->b.contains("1")).forEach(a1 -> System.out.println(a1)));
        */

       /* list1.stream()
                .filter(f-> f.contains("1"))
                .forEach( list2.stream().filter()
                );*/

     /*   // without sorted
        Map<String, String> response = IntStream.range(0, list1.size())
                                    .boxed()
                                    .collect(Collectors.toMap(list1::get, list2::get));
        */

     /*   for (int i = 0; i < list1.size(); i++) {
            mapResult.put(list1.get(i), String.valueOf(list2);
        }*/

        for (int i = 0; i < list1.size(); i++) {
            mapResult.put(list1.get(i), list2.get(i));
        }

//        System.out.println(mapResult);
        // Automatically sorted
        /*Map<String, String> response = IntStream.range(0, list1.size())
                                    .boxed()
                                    .collect(Collectors.toMap(list1::get,
                                            list2.stream().collect(Collectors.toList())::get));*/
Map<String, String> response =  IntStream.range(0, list1.size())
                                    .boxed()
                                    .collect(Collectors.toMap(list1::get,
                                            list2::get));

        Map<String, String> map = IntStream.range(0, list1.size())
                .collect(
                        HashMap::new,
                        (m, i) -> m.put(list1.get(i), String.valueOf(list2)),
                        Map::putAll);

        System.out.println(response);
        System.out.println("map");
        System.out.println(map);
        return response;
    }

    public static void main(String[] args) {
        twoListsToMap.ListsMergedToMap();
    }

}
