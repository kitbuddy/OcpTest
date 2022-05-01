/*import java.util.Arrays;
import java.util.Random;

public class testClass {

    public static void main(String[] args) throws Exception {

        int[] intArray = {1,2,3,4,5};
//        testClass.getSuffledArray(intArray);
        testClass.getSuffledArray2(intArray);
//        System.out.println(testClass.getResetArray(intArray));
    }

    private static int[] getResetArray(int[] intArray) {
        System.out.println("reset Array");
        Arrays.stream(intArray).forEach(System.out::print);
        System.out.println(", ");
        return intArray;
    }

    private static void getSuffledArray(int[] intArray) throws Exception {
        //Ficher Yates Algo

        int[] intArrayOld = intArray;

        Random random = new Random();
        int randomIndexToSwap = random.nextInt(intArrayOld.length);

        for (int i = 0; i < intArrayOld.length -1; i++) {

            int temp = intArrayOld[randomIndexToSwap];
            intArrayOld[randomIndexToSwap] = intArrayOld[i];
            intArrayOld[i] = temp;

        }

       Arrays.stream(intArrayOld).forEach(System.out::println);
    }

    private static void getSuffledArray2(int[] intArray) throws Exception {
        System.out.println("getSuffledArray2");
        Random random = new Random(intArray.length);
        int[] originalArray = intArray;

        for (int i = intArray.length-1; i >0; i--) {
            int j = random.nextInt(i+1);
            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;

        }
       Arrays.stream(intArray).forEach(System.out::println);
    }
}
*/
