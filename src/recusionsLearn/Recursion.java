package recusionsLearn;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(Recursion.reverseString("hello"));
        System.out.println(Recursion.isPalindrome("racecar"));
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
    /*

     */




}
