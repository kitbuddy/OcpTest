import java.util.*;

class Node {

    int data;
    Node next;

    Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }


}
public class JPMC {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ankit");

        //[1,2, 3]
        // [2,3,8]
        // [3,5, 7]

         System.out.println(JPMC.getData(Arrays.asList(1, 2, 3), Arrays.asList(2,3,8)));
    }



    private static List<Integer> getData(List<Integer> arr1, List<Integer> arr2) {

        if(arr1.isEmpty() && arr2.isEmpty()) {
            return null;
        }

        if(!arr1.isEmpty() && !arr2.isEmpty()) {
//            for (int i = 0; i < arr1.size(); i++) {
//                for (int j = 0; j < arr2.size(); j++) {
//                    finalArr.set(i, arr1.get(i) + arr2.get(i));
//                }
//            }

            if(arr1.size() == arr2.size()) {
                sum(arr1, arr2);
            }
        }

        return arr1;
    }

    private static void sum(List<Integer> arr1, List<Integer> arr2) {
        for (int i = arr1.size(); i < 0; i--) {
            int sum = arr1.get(i) + arr2.get(i);
            if( sum > 9) {
                // 12
                // 1 = arr1[i-1]
                // arr[i] = 2

                arr1.set(i, sum-10);
//                arr1.set(i-1, arr1.get(i-1) + 10);



            }


        }
    }
}
