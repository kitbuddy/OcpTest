package recusionsLearn;


public class Recursion {
    static Node head;

   static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(recursiveSummation(5));
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 1, 6, 5));
        printFibonacci(10);
        System.out.println();
        System.out.println("-----Merge sort------");

        int[] inputMergeSort = new int[] {-1, 20, 10, 40, 20, -5, 16};

        mergeSort(inputMergeSort, 0, inputMergeSort.length -1);
        System.out.println("-----Stop mergeSort----");

        System.out.println("Linked List reversal");
        Recursion list = new Recursion();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.linkedlistReversal(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

    }

    public static String reverseString(String input) {

        if(input.equals("")){
            return "";
        }
        // hello
        return reverseString(input.substring(1)) + input.charAt(0);
    }


    //getMyPositionsInLine
   /* public int getMyPositionsInLine(Person person) {
        if (person.nextInLine == null) {
            return 1;
        }

        return 1+ getMyPositionsInLine(person.nextInLine);
    }*/

    //revise(essay)
   /* function revise(essay) {
        read(essay);
        get_feedback_on(essay);
        apply_changes_to(essay);

        revise(essay) unless essay.complete?;
    }*/

    //recursion(in someValue)
    /*
     public void recursion(in someValue) {
         if (someValue == 10) { // ---> base case
            return;
         }

         return recursion(someValue+1) // ---> recursive call
     }
     * */
    //Pros and cons
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

    // Merge Sort
    public static void mergeSort(int[] data, int start, int end) {

        if(start < end) {
            int mid = (start + end) /2;

            mergeSort(data, start , mid);
            mergeSort(data, mid + 1, end);

            merge(data, start, mid, end);
        }
    }

    private static void merge(int[] data, int start, int mid, int end) {

        // build temporary array to avaoid modifying original contents

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid +1;
        int k = 0;

        while (i <= mid && j<=end) {
            if (data[i] <= data[j]) {
                temp[k++] = data[i++];
                /*temp[k] = data[i];
                i++;
                k++;*/
            } else {
                temp[k++] = data[j++];
            }

//            Add the rest of the value from the left sub array into the result
            while (i <= mid) {
                temp[k++] = data[i++];
            }

            // Add the rest of the value from the right sub array into the result
            while (j<=end) {
                temp[k++] = data[j++];
            }

            for (i = start; i<=end; i++) {
                data[i] = temp[i-start];
            }


         }


        for (int i1 = 0; i1 < data.length; i1++) {
            System.out.print(data[i1]);
            System.out.print(", ");
        }
        System.out.println("again");


    }

    public static Node linkedlistReversal(Node head) {

        if(head == null || head.next == null ) return head;

        Node p = linkedlistReversal(head.next);

        head.next.next = head;
        head.next = null;

        return p;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
