package StreamDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeTwoMaps {

    public static void main(String[] args) {


        Map<String, Long> map = new HashMap<>();

        map.put("Apple", 2L);
        map.put("Banana", 2L);

        Map<String, Long> map1 = new HashMap<>();

        map1.put("Apple", 2L);
        map1.put("Orange", 2L);

        Map<String, Long> result = Stream.concat(map.entrySet().stream(), map1.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (countInFirstMap, countInSecondMap) -> countInFirstMap + countInSecondMap));

        System.out.println(result);
    }
}
