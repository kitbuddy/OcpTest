package StreamDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapClass {

    public static void main(String[] args) {

        Map<String, Long> map1 = new HashMap<>();

        map1.put("Apple", 2L);
        map1.put("Banana", 2L);

        Map<String, Long> map2 = new HashMap<>();
        Map<String, Long> finalMap = new HashMap<>();

        map2.put("Apple", 2L);
        map2.put("Orange", 2L);

        Set<Map.Entry<String, Long>> entrySetObjMap1 = map1.entrySet();
        Set<Map.Entry<String, Long>> entrySetObjMap2 = map2.entrySet();
/*
        System.out.println("entrySetObj");
        System.out.println(entrySetObjMap1);

        entrySetObjMap1.stream().forEach(a -> System.out.println(a));
        entrySetObjMap2.stream().forEach(a2 -> System.out.println(a2));*/


        Stream<Map.Entry<String, Long>> streamsAdd = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream());


        System.out.println("finalMap");
        System.out.println(streamsAdd.collect(Collectors.toList()));


    }
}
