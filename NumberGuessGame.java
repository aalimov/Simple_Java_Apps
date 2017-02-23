import java.util.Scanner;

public class NumberGuessGame {
    public static void guessNumber(int lowVal, int highVal) {
        Scanner scnr = new Scanner(System.in);
        int midVal = 0;
        char userAnswer = '-';

        midVal = (highVal + lowVal) / 2;


        System.out.print("Is it " + midVal + "? (l/h/y): ");
        userAnswer = scnr.next().charAt(0);

        if ((userAnswer != 'l') && (userAnswer != 'h')) {
            System.out.println("Thank you!");
        }
        else {
            if (userAnswer == 'l') {
                guessNumber(lowVal, midVal);
            }
            else {
                guessNumber(midVal + 1, highVal);
            }
        }

        return;
    }

    public static void main(String[] args) {
        System.out.println("Choose a number from 0 to 100.");
        System.out.println("Answer with:");
        System.out.println("   l (your num is lower)");
        System.out.println("   h (your num is higher)");
        System.out.println("   any other key (guess is right).");

        guessNumber(0, 100);

        return;
    }
}