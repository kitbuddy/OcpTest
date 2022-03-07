package recusionsLearn;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(Recursion.reverseString("hello"));
        System.out.println(Recursion.isPalindrome("racecar"));
        System.out.println(Recursion.recursiveSummation(5));
        System.out.println(Recursion.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 1, 6, 5));
        Recursion.printFibonacci(10);
    }
    public static String reverseString(String input) {

        if(input.equals("")){
            return "";
        }
        // hello
        return reverseString(input.substring(1)) + input.charAt(0);
    }


   /* public int getMyPositionsInLine(Person person) {
        if (person.nextInLine == null) {
            return 1;
        }

        return 1+ getMyPositionsInLine(person.nextInLine);
    }*/

   /* function revise(essay) {
        read(essay);
        get_feedback_on(essay);
        apply_changes_to(essay);

        revise(essay) unless essay.complete?;
    }*/

    /*

     public void recursion(in someValue) {
         if (someValue == 10) { // ---> base case
            return;
         }

         return recursion(someValue+1) // ---> recursive call
     }
     * */
   /*
  p-  bridges the gap between elegance and complexity
  c - slowness of CPU overhead

p - can reduce time complexity with memoization
c - can be unnecessarily complex if poorly constructed

p- reduce s the need for complex loops and auxiliary data structures
c - can lead out to out of memory error/ stack overflow exceptions

p - works really well with recursive structures like trees and graphs
    */

    // Call Stack
    /*

    public String reverseString(String input) {
        // what is the base case?
            if( input.equals("") {
                return "";
            }
        // what is the smallest amount of work I can assign to each iteration?
            return reverseString(inout.subsString(1) + input.charAt(0);
    }

    when can it no longer continue?

    }
    */

    // Palindrome

    public static boolean isPalindrome(String input) {

        if(input.length() == 0 || input.length() == 1) {
            return true;
        }

        if( input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length()-1));
        }

        return false;
    }

    // Sum Of all natural numbers

    public static int recursiveSummation(int inputnumber) {

        if (inputnumber <= 1) {
            return inputnumber;
        }

        return inputnumber + recursiveSummation(inputnumber -1);
    }

    // Divide and Conquer
    // Binary Search

//    sorted list of numbers - key point they are sorted

    public static int binarySearch(int[] A, int left, int right, int x) {

        if(left > right) {
            return -1;
        }

        int mid =  (left + right) /2;

        if (x == A[mid]) {
            return  mid;
        }

        if (x< A[mid]) {
            return binarySearch(A, left, mid-1, x);
        }

        return binarySearch(A, mid+1, right, x);
    }

    // Fibonacci

    public static void printFibonacci(int N) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }

    }

}
