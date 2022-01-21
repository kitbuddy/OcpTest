public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here

        int level = 0;
        int valleys = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'U'){
                level++;
            }else if(path.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
        System.out.println(valleys);
        return valleys;
    }

    public static void main(String[] args) {
        CountingValleys.countingValleys(8, "UDDDUDUU");
    }

}
