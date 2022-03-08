package wayfair;

import apple.laf.JRSUIUtils;

import java.util.*;
import java.util.stream.Collectors;

public class wayfair2 {

    /*
Suppose we have an unsorted log file of accesses to web resources. Each log entry consists of an access time, the ID of the user making the access, and the resource ID.

The access time is represented as seconds since 00:00:00, and all times are assumed to be in the same day.

For example:
logs1 = [
    ["58523", "user_1", "resource_1"],
    ["62314", "user_2", "resource_2"],
    ["54001", "user_1", "resource_3"],
    ["200", "user_6", "resource_5"],
    ["215", "user_6", "resource_4"],
    ["54060", "user_2", "resource_3"],
    ["53760", "user_3", "resource_3"],
    ["58522", "user_22", "resource_1"],
    ["53651", "user_5", "resource_3"],
    ["2", "user_6", "resource_1"],
    ["100", "user_6", "resource_6"],
    ["400", "user_7", "resource_2"],
    ["100", "user_8", "resource_6"],
    ["54359", "user_1", "resource_3"],
]


We would like to compute user sessions, specifically: write a function that takes the logs and returns a data structure that associates to each user their earliest and latest access times.

Example:
{'user_1': [54001, 58523],
 'user_2': [54060, 62314],
 'user_3': [53760, 53760],
 'user_5': [53651, 53651],
 'user_6': [2, 215],
 'user_7': [400, 400],
 'user_8': [100, 100],
 'user_22': [58522, 58522],
}

Example 2:
logs2 = [
    ["300", "user_1", "resource_3"],
    ["599", "user_1", "resource_3"],
    ["900", "user_1", "resource_3"],
    ["1199", "user_1", "resource_3"],
    ["1200", "user_1", "resource_3"],
    ["1201", "user_1", "resource_3"],
    ["1202", "user_1", "resource_3"]
]

Should return:
{'user_1': [300, 1202]}

Example 3:
logs3 = [
    ["300", "user_10", "resource_5"]
]

Should return:
{'user_10': [300, 300]}

Complexity analysis variables:

n: number of logs in the input

*/

        public static void main(String[] argv) {
            String[][] logs1 = new String[][] {
                    { "58523", "user_1", "resource_1" },
                    { "62314", "user_2", "resource_2" },
                    { "54001", "user_1", "resource_3" },
                    { "200", "user_6", "resource_5" },
                    { "215", "user_6", "resource_4" },
                    { "54060", "user_2", "resource_3" },
                    { "53760", "user_3", "resource_3" },
                    { "58522", "user_22", "resource_1" },
                    { "53651", "user_5", "resource_3" },
                    { "2", "user_6", "resource_1" },
                    { "100", "user_6", "resource_6" },
                    { "400", "user_7", "resource_2" },
                    { "100", "user_8", "resource_6" },
                    {"54359", "user_1", "resource_3"},
            };


            String[][]  logs2 = new String[][] {
                    {"300", "user_1", "resource_3"},
                    {"599", "user_1", "resource_3"},
                    {"900", "user_1", "resource_3"},
                    {"1199", "user_1", "resource_3"},
                    {"1200", "user_1", "resource_3"},
                    {"1201", "user_1", "resource_3"},
                    {"1202", "user_1", "resource_3"}
        };

            String[][]  logs3 = new String[][] {
                    {"300", "user_10", "resource_5"}
        };

            System.out.println("log 1");
            wayfair2.findStartAndEndTimeLogForUser(logs1);
            System.out.println("log 2");
            wayfair2.findStartAndEndTimeLogForUser(logs2);
            System.out.println("log 3");

            wayfair2.findStartAndEndTimeLogForUser(logs3);
        }

    private static void findStartAndEndTimeLogForUser(String[][] logs1) {

        Set<String> userNameSet = new HashSet<>();

        Map<String , List<String>> timeMap = new HashMap<>();


        for (int i = 0; i < logs1.length; i++) {

            for (int i1 = 0; i1 < logs1[i].length; i1++) {
                userNameSet.add(logs1[i][1]);

                    String key = logs1[i][1];
                    if(timeMap.containsKey(key)) {
                        List<String> value = timeMap.get(key);
                        value.add(logs1[i][0]);
                        timeMap.put(logs1[i][1], value );
                    } else {
                        List<String> listToFTimes = new ArrayList<>();
                        listToFTimes.add(logs1[i][0]);
                        timeMap.put(logs1[i][1], listToFTimes );

                    }
            }

        }

        timeMap.entrySet().forEach(a -> {
            Collections.sort(a.getValue());

            List<String> listValues = a.getValue();
            List<String> finalValues = new ArrayList<>();

            if(listValues.size() > 1) {
                finalValues.add(listValues.get(0));
                finalValues.add(listValues.get(listValues.size()-1));
             } else {
                finalValues.add(listValues.get(0));
                finalValues.add(listValues.get(0));
            }

            a.setValue(finalValues);
        });

        System.out.println(timeMap);

        if(timeMap.size() > 1) {
            Map<String, List<String>> finalTimeMap = new TreeMap<String, List<String>>();

            finalTimeMap.putAll(timeMap);
            System.out.println(finalTimeMap);
        }
    }
}
