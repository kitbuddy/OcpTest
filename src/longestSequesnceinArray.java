import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class longestSequesnceinArray {

    public static void getLongestArraySequesnce(int integerList[]){
        Arrays.sort(integerList);

        int count = 0;
        int ans = 0;

        AtomicInteger count1 = new AtomicInteger();
        AtomicInteger ans1 = new AtomicInteger(0);

        ArrayList<Integer> integerListTOCHECK = new ArrayList<>();
        integerListTOCHECK.add(integerList[0]);

        for (int i = 1; i < integerList.length; i++)
        {
            if ( integerList[i] != integerList[i - 1])
                integerListTOCHECK.add(integerList[i]);
        }


        System.out.println(integerListTOCHECK);
        for (int i = 0; i < integerListTOCHECK.size(); i++) {
            if(i > 0 && integerListTOCHECK.get(i) == integerListTOCHECK.get(i-1) + 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans , count);
        }

        System.out.println("ans : " + ans);
        System.out.println("count : " + count);

        System.out.println("Longest Sequence list length: " +  ans);

    }

    public static void main(String[] args) {
        int integerList[]  = { 1,4,2,5,6,11,22,23,3 };

        longestSequesnceinArray.getLongestArraySequesnce(integerList);
    }

}
