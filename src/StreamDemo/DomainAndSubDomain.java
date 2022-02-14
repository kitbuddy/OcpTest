package StreamDemo;

import java.util.*;
import java.util.stream.Collectors;

class ClicksCount {
    String numberOfClicks;
    String nameOfClicks;
}

public class DomainAndSubDomain {

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

//            DomainAndSubDomain.getAllCounts(counts);
            DomainAndSubDomain.getMapfromList(counts);
//            DomainAndSubDomain.subdomainVisits(counts);
        }

    /*private static List<String> getCountsAns(String[] cpdomains) {

        Map<String, Integer> counts = new HashMap();
        for (String domain: cpdomains) {
            String[] cpinfo = domain.split("\\s+");

            System.out.println(Arrays.asList(cpinfo));
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for (int i = frags.length - 1; i >= 0; --i) {
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }

        List<String> ans = new ArrayList();
        for (String dom: counts.keySet())
            ans.add("" + counts.get(dom) + " " + dom);
        return ans;
    }*/

    public static void getMapfromList(String[] counts) {

        Map<String[], String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        List<String> rowList = new ArrayList<>();

        for (int i = 0; i < counts.length; i++) {
            rowList.add(counts[i]);
        }

        List<String[]> listOfValues = rowList.stream().map(a -> a.split(",")).collect(Collectors.toList());


        for (int i=0; i<listOfValues.size(); i++ ) {
//            System.out.println(Arrays.asList(listOfValues.get(i)));

        }


       for(int i=0; i<listOfValues.size(); i++) {

                String[] aa = listOfValues.get(i);

                String count = aa[0].trim();
                String domain = aa[1].trim();

                if (domain.contains(".")) {
                    String[] value = domain.split("\\.");
                    map.put(value, count);
                }
            }
        System.out.println("-----MAP--start----");
        map.entrySet().forEach(val -> {
            for (int i = 0; i < val.getKey().length; i++) {

                map2.put(val.getKey()[i], val.getValue());
                Arrays.asList(val.getKey()).remove(i);

                System.out.println("after removal");
                System.out.println(Arrays.asList(val.getKey()));

                map2.put(val.getKey()[i], val.getValue());



                if (!map2.get(val.getKey()[i]).isEmpty()) {
                    map2.put(val.getKey()[i], val.getValue() + map2.get(val.getKey()[i]));

                }
            }
        });

//        map2.entrySet().forEach(val -> System.out.println(val));


        System.out.println("-----MAP------");

     /*  map.entrySet().forEach( val -> {
           System.out.println(Arrays.asList(val.getKey()) + "," + val.getValue());

           Arrays.stream(val.getKey()).sorted().forEach( keys -> {
               map2.put(keys, val.getValue());
           });
       });*/
//        System.out.println("-----------");


      /*  map.entrySet().stream().forEach(a -> {
            Arrays.stream(a.getValue()).forEach(val -> {
                map2.put(a.getKey(), val);
            });

        });
*/

//        map.entrySet().forEach(val -> System.out.println(val.getKey() + "," + Arrays.asList(val.getValue()) ));






//        map2.entrySet().forEach(val -> System.out.println(val));

    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> count = new HashMap();
        for (String cd : cpdomains) {
            int i = cd.indexOf(' ');
            int n = Integer.valueOf(cd.substring(0, i));
            String s = cd.substring(i + 1);
            for (i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '.') {
                    String d = s.substring(i + 1);
                    count.put(d, count.getOrDefault(d, 0) + n);
                }
            }
            count.put(s, count.getOrDefault(s, 0) + n);
        }

        List<String> res = new ArrayList();
        for (String d : count.keySet()) res.add(count.get(d) + " " + d);
        return res;
    }

    public static void getAllCounts(String[] counts) {


            String[] stringArray = {};
            Map<String, String> stringMap = new HashMap<>();
            Map<String, String> stringMapFinal = new HashMap<>();

            List<String> rowList = new ArrayList<>();

            for (int i = 0; i < counts.length; i++) {
                rowList.add(counts[i]);
            }

            List<String[]> listOfValues = rowList.stream().map(a -> a.split(",")).collect(Collectors.toList());

            for(int i=0; i<listOfValues.size(); i++) {

                String[] aa = listOfValues.get(i);

                String count = aa[0].trim();
                String domain = aa[1].trim();

                stringMap.put(count, domain);
            }

            stringMap.entrySet().forEach(a -> {
                if(!a.getValue().isEmpty() && a.getValue().contains(".")) {

                   String[] valuesList = "mobile.sports.yahoo.com".split("\\.");

                    for (int i = 0; i < valuesList.length-1 ; i++) {
                        System.out.println(valuesList[i] + "." + valuesList[i+1] );
                    }
                    System.out.println("---------");

                    for(int i=0; i<valuesList.length; i++) {

                        stringMapFinal.put(a.getKey(), valuesList[i]);
                        stringMapFinal.put(a.getKey(), a.getValue());

                    }


                } else if (!a.getValue().isEmpty() && !a.getValue().contains(".")) {

                    System.out.println("NOT a Domain");
                }


            });

            System.out.println("stringMapFinal");
            System.out.println(stringMapFinal);
            System.out.println(stringMapFinal.size());
        }

}
