package DomainAndSubDomain;

import java.util.*;
import java.util.stream.Stream;

public class MapById {

    public static void main(String[] args) {

        MapById.getNumberCountById();
    }

    private static Map<String, String>  getNumberCountById() {


        Map<String, String> flagMap = new HashMap<>();

        Map<String, String> finalMap = new HashMap<>();
        Map<String, String> finalMap2 = new HashMap<>();

        flagMap.put("1", "India.kabbadi.com");

        List<String> keyList = new ArrayList<>();


        flagMap.entrySet().forEach(
                a -> finalMap.put(a.getValue(), a.getKey())
        );


        finalMap.entrySet().forEach(a -> {
            keyList.add(a.getKey());
            for(String s : keyList) {
                String[] keyArray = s.split("\\.");

                Arrays.stream(keyArray).forEach(a2 -> {
                    finalMap2.putAll(finalMap);
                });

                System.out.println("--------");
                for (int i = 0; i < keyArray.length-1; i++) {
                    finalMap2.put(keyArray[i] + "." + keyArray[i+1], a.getValue());
                }
            }
        });

        System.out.println(finalMap2);

        return finalMap2;
    }
}
