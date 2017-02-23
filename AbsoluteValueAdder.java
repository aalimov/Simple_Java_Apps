import java.util.Scanner;

// Program calculates X = | Y | + | Z |

public class AbsoluteValueAdder {
    // Method returns the absolute value
    public static int absValueConv(int origValue) {
        int absValue = 0;  // Resulting abs val

        if (origValue < 0) {  // origVal is neg
            absValue = -1 * origValue;
        }
        else {  // origVal is pos
            absValue = origValue;
        }

        return absValue;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userValue1 = 0; // First user value
        int userValue2 = 0; // Second user value
        int sumValue = 0;   // Resulting value

        // Prompt user for inputs
        System.out.print("Enter first value: ");
        userValue1 = scnr.nextInt();

        System.out.print("Enter second value: ");
        userValue2 = scnr.nextInt();

        sumValue = absValueConv(userValue1) + absValueConv(userValue2);
        System.out.println("Total: " + sumValue);

        return;
    }