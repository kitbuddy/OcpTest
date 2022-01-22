    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;

    public class HourGlassIntArray {
            /*
             * Complete the 'hourglassSum' function below.
             *
             * The function is expected to return an INTEGER.
             * The function accepts 2D_INTEGER_ARRAY arr as parameter.
             */

            public static int hourglassSum(List<List<Integer>> arr) {
                List<Integer> sumValues = new ArrayList<>();

               int sum = 0;
                for (int i = 0; i < arr.size(); i++) {
                    for (int j = 0; j < 5; j++) {
                        sum = 0;
                        if (i<=3 && j <= 3){
                             sum = (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) )
                                    + (arr.get(i+1).get(j+1))
                                     + (arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2));


                           sumValues.add(sum);
                        }
                       /* if (i==3 && j==3) {
                            System.out.println(arr.get(i).get(j));
                            System.out.println(arr.get(i).get(j));
                            System.out.println(arr.get(i).get(j+1));
                        }*/
                    }
                }

                Collections.sort(sumValues);
                System.out.println(sumValues);
                int largestValue = sumValues.get(sumValues.size() -1);


//                int finalSum = sumValues.stream().mapToInt(a -> a).sum();

                return largestValue;
            }


        public static void main(String[] args) {

            List<List<Integer>> arr = new ArrayList<>();
            List<Integer> line1 = Arrays.asList(1,1,1,0,0,0);
            List<Integer> line2 = Arrays.asList(0,1,0,0,0,0);
            List<Integer> line3 = Arrays.asList(1,1,1,0,0,0);
            List<Integer> line4 = Arrays.asList(0,0,2,4,4,0);
            List<Integer> line5 = Arrays.asList(0,0,0,2,0,0);
            List<Integer> line6 = Arrays.asList(0,0,1,2,4,0);

            arr.add(0, line1);
            arr.add(1, line2);
            arr.add(2, line3);
            arr.add(3, line4);
            arr.add(4, line5);
            arr.add(5, line6);

            System.out.println(HourGlassIntArray.hourglassSum(arr));

        }

    }


