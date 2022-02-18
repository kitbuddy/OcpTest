package StreamDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

    public static void main(String[] args) {
        System.out.println(MapToList.converMapToList());

    }

    private static List<String> converMapToList() {
        Map<String, String> map = new HashMap<>();

        map.put("firstKey", "val1");
        map.put("secondKey", "val2");
        map.put("thirdKey", "val3");
        map.put("fourthKey", "val4");

        List<String> getAllKeys = new ArrayList<>(map.keySet());
//        List<String> getAllValues = new ArrayList<>(map.values());

        return getAllKeys;


    }
}
