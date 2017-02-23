import java.util.Scanner;

// Output GCD of user-inputs A and B
public class GCDCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numA = 0; // User input
        int numB = 0; // User input

        System.out.print("Enter first positive integer: ");
        numA = scnr.nextInt();

        System.out.print("Enter second positive integer: ");
        numB = scnr.nextInt();

        // Euclid's algo
        while ( numA != numB ) {
            if ( numB > numA ) {
                numB = numB - numA;
            }
            else {
                numA = numA - numB;
            }
        }

        System.out.println("The GCD is: " + numA);

        return;
    }
}

//RECURSIVE
//import java.util.Scanner;
//
//public class GCDCalc {
//    /* Determine the greatest common divisor
//       of two numbers, e.g. GCD(8, 12) = 4
//    */
//    public static int gcdCalculator(int inNum1, int inNum2) {
//        int gcdVal = 0; // Holds GCD results
//
//        if (inNum1 == inNum2) {   // Base case: Numbers are equal
//            gcdVal = inNum1;       // Return value
//        }
//        else {                    // Recursive case: subtract smaller from larger
//            if (inNum1 > inNum2) { // Call function with new values
//                gcdVal = gcdCalculator(inNum1 - inNum2, inNum2);
//            }
//            else { // n1 is smaller
//                gcdVal = gcdCalculator(inNum1, inNum2 - inNum1);
//            }
//        }
//
//        return gcdVal;
//    }
//
//    public static void main (String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        int gcdInput1 = 0; // First input to GCD calc
//        int gcdInput2 = 0; // Second input to GCD calc
//        int gcdOutput = 0; // Result of GCD
//
//        // Print program function
//        System.out.println("This program outputs the greatest \n" +
//                "common divisor of two numbers.");
//
//        // Prompt user for input
//        System.out.print("Enter first number: ");
//        gcdInput1 = scnr.nextInt();
//
//        System.out.print("Enter second number: ");
//        gcdInput2 = scnr.nextInt();
//
//        // Check user values are > 1, call recursive GCD function
//        if ((gcdInput1 < 1) || (gcdInput2 < 1)) {
//            System.out.println("Note: Neither value can be below 1.");
//        }
//        else {
//            gcdOutput = gcdCalculator(gcdInput1, gcdInput2);
//            System.out.println("Greatest common divisor = " +  gcdOutput);
//        }
//
//        return;
//    }
//}
