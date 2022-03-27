package TrainingQuestions;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class SwappingTwoNumbers {



    public static void main(String[] args) {
        int a = 10;
        int b= 20;

        System.out.println("before swapping");
        System.out.println("a => " + a + "b=> " + b);
        // System.out.println("// Using Third variable");
//        int t =a;
//        a = b;
//        b =t;

       /* System.out.println(// using addition and subtraction);
        a = a+b;
        b = a-b;
        a = a-b;*/
        /* System.out.println("  using MULTIPLICATION and DIVISION");
        a = (a*b);
        b = a/b;
        a = a/b; */

       /* System.out.println("Using BITWIST XOR operator");

        a = a^b;
        b = a^b;
        a = a^b;*/

        System.out.println("Single statement");

        b = a+b-(a=b);
        System.out.println("// after swapping ");

        System.out.println("a => " + a + "b=> " + b);

    }
}
