package DomainAndSubDomain;

import java.util.*;
import java.util.stream.Collectors;


public class DomainAndSubDomain2 {

/*

You are in charge of a display advertising program. Your ads are displayed on websites all over the internet.
You have some CSV input data that counts how many times that users have clicked on an ad on each individual domain.
Every line consists of a click count and a domain name, like this:
 */
/*
counts = [ "900,google.com",
     "60,mail.yahoo.com",
     "10,mobile.sports.yahoo.com",
     "40,sports.yahoo.com",
     "300,yahoo.com",
     "10,stackoverflow.com",
     "20,overflow.com",
     "5,com.com",
     "2,en.wikipedia.org",
     "1,m.wikipedia.org",
     "1,mobile.sports",
     "1,google.co.uk"]

Write a function that takes this input as a parameter and returns a data structure containing the number of clicks that were recorded on each domain AND each subdomain under it. For example, a click on "mail.yahoo.com" counts toward the totals for "mail.yahoo.com", "yahoo.com", and "com". (Subdomains are added to the left of their parent domain. So "mail" and "mail.yahoo" are not valid domains. Note that "mobile.sports" appears as a separate domain near the bottom of the input.)

Sample output (in any order/format):

calculateClicksByDomain(counts) =>
com:                     1345
google.com:              900
stackoverflow.com:       10
overflow.com:            20
yahoo.com:               410
mail.yahoo.com:          60
mobile.sports.yahoo.com: 10
sports.yahoo.com:        50
com.com:                 5
org:                     3
wikipedia.org:           3
en.wikipedia.org:        2
m.wikipedia.org:         1
mobile.sports:           1
sports:                  1
uk:                      1
co.uk:                   1
google.co.uk:            1

n: number of domains in the input
(individual domains and subdomains have a constant upper length)

*/


        public static void main(String[] argv) {
            String[] counts = {
                    "900,google.com",
                    "60,mail.yahoo.com",
                    "10,mobile.sports.yahoo.com",
                    "10,mail.sports.yahoo.com",
                    "40,sports.yahoo.com",
                    "300,yahoo.com",
                    "10,stackoverflow.com",
                    "20,overflow.com",
                    "5,com.com",
                    "2,en.wikipedia.org",
                    "1,m.wikipedia.org",
                    "1,mobile.sports",
                    "1,google.co.uk"
            };

            DomainAndSubDomain2.calculateClicksByDomain(counts);

        }

    private static void calculateClicksByDomain(String[] counts) {
            Map<String, String> valueMap = new HashMap<>();
            Map<String, String> finalValueMap = new HashMap<>();

        for (String val: counts) {
            String[] row = val.split("\\,");

            for (int i = 0; i < row.length-1; i++) {
                valueMap.put(row[i+1], row[i]);
            }

        }

        valueMap.entrySet().forEach(entry -> {

            String[] keyMap = entry.getKey().split("\\.");

            System.out.println(Arrays.toString(keyMap));
            for (String s: keyMap) {
                finalValueMap.put(s, entry.getValue());

            }
        });

        System.out.println(finalValueMap);
    }


    private static List<String>  getNumberCountById( Map<Integer, String> flagMap) {
       /* Map<Integer, String> flagMap = new HashMap<>();
        flagMap.put(1, "India.com");*/

        List<String> keyList = new ArrayList<>();

        String[] allStringKeys = new String[0];

        flagMap.entrySet().forEach(a -> keyList.add(a.getValue()));


        for(String s : keyList) {
            allStringKeys = s.split("\\.");

        }

        Arrays.stream(allStringKeys).forEach(a -> keyList.add(a));

        keyList.stream().forEach(System.out::println);

        return keyList;
    }
}
