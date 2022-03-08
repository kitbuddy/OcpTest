package wayfair;

import java.util.*;

public class wayfair {

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

            String[][] logs2 = new String[][] {
                    {"300", "user_1", "resource_3"},
                    {"599", "user_1", "resource_3"},
                    {"900", "user_1", "resource_3"},
                    {"1199", "user_1", "resource_3"},
                    {"1200", "user_1", "resource_3"},
                    {"1201", "user_1", "resource_3"},
                    {"1202", "user_1", "resource_3"}
            };

            String[][] logs3 = new String[][] {
                    {"300", "user_10", "resource_5"}
            };

//            wayfair.wayfair.UserArrayMap(logs2);
            wayfair.breakOnUserMap(logs1);
        }

    private static void breakOnUserMap(String[][] logs1) {
         logs1 = new String[][] {
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

     /*   Set<String> userSet = new HashSet<>();
        List<String> stringList = null;
        Map<String, List<String>> mapBasedOnUser = new HashMap<>();
        String  key = null;

        for (int i = 0; i < logs1.length; i++) {
            for (int j = 0; j < 2; j++) {
                stringList = new ArrayList<>();

                key = logs1[i][1];

                if(logs1[i][1] == key) {
                    String value = logs1[i][0];
                    stringList.add(value);
                }
            }
            mapBasedOnUser.put(key, stringList);

        }

        System.out.println(mapBasedOnUser);
*/

        final Map<String, String> map = new HashMap<String, String>(logs1.length);
        final Map<String, List<String>> map2 = new HashMap<String, List<String>>(logs1.length);
        for (String[] mapping : logs1)
        {
            map.put(mapping[0], mapping[1]);
        }

        map.entrySet().forEach(a -> {
            map2.put(a.getValue(), Collections.singletonList(a.getKey()));
        });

        System.out.println(map2);
    }


    public static void UserArrayMap(String[][] logs ) {

            Map<String, List<String>> namesMap = new HashMap<>();
            List<String> times = new ArrayList<>();

            List<String> timees = new ArrayList<>();

            for(int i =0; i< logs.length; i++) {

                String[] lineArr = logs[i];

                times.add(lineArr[0]);

                namesMap.put(lineArr[1], times);


                namesMap.entrySet().forEach(a -> {
                    timees.add(a.getValue().get(0));
                    timees.add(a.getValue().get(a.getValue().size() - 1));
                });

            }
//            System.out.println(timees);
//            namesMap.put(lineArr[1], timees);

            namesMap.entrySet().forEach(System.out::println);

        }






}
