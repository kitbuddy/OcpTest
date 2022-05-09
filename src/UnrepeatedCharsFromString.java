import java.util.*;
import java.util.stream.Collectors;

public class UnrepeatedCharsFromString {

    // input Assessment
    // output amnt

    public static void main(String[] args) {
        String input = "Assessment";
//        UnrepeatedCharsFromString.printAnswer(input);
//        System.out.println(UnrepeatedCharsFromString.FindFirstNonRepeatingChar(input));
//        System.out.println(UnrepeatedCharsFromString.getNonRepeated(input));
        System.out.println(UnrepeatedCharsFromString.getNonRepeatedByMap(input));

    }

    private static boolean getNonRepeatedByMap(String input) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            charMap.put(ch, charMap.containsKey(ch) ? 0 : 1);
//            charMap.put(ch, charMap.containsKey(ch)? charMap.get(ch) + 1 : 1);
        }

        List<Map.Entry<Character, Integer>> finalList = charMap.entrySet().stream().filter(val -> val.getValue() == 1).collect(Collectors.toList());
        finalList.forEach(value -> System.out.println(value.getKey()));
        return true;

    }

    private static Character FindFirstNonRepeatingChar(String input) {

        Set<Character> nonRepeatingCharsSet = new HashSet<>();

        List<Character> charNonrepeatingList = new ArrayList();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if(nonRepeatingCharsSet.contains(current)){
                continue;
            }

            if(charNonrepeatingList.contains(current)){
                charNonrepeatingList.remove((Character) current);
                nonRepeatingCharsSet.add(current);
            } else {
                charNonrepeatingList.add(current);
            }
        }
        return charNonrepeatingList.get(0);
    }

    private static List<Map.Entry<Character, Integer>> getNonRepeated(String input) {

        Map<Character, Integer> map = new LinkedHashMap();

        for (Character ch : input.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        // get first non repeated Char
//        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

        // get All Non repeated char
        return map.entrySet().stream().filter(val -> val.getValue() == 1).collect(Collectors.toList());

    }
 }
/*
    private static void printAnswer(String input) {

        String temp = "" ;

        for(int i=0; i<input.length(); i++ ) {
            char current = input.charAt(i);

            if(temp.indexOf(current) <0){
                temp = temp + input.charAt(i);
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }

        }
        System.out.println(temp + "");
    }*/
//}
