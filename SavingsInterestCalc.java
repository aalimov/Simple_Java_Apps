import java.util.Scanner;

public class SavingsInterestCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int INIT_SAVINGS = 10000;    // Initial savings
        final double INTEREST_RATE = 0.05; // Interest rate
        int userYears = 0;                 // User input of number of years
        int i = 0;                         // Loop variable
        double currSavings = 0.0;          // Savings with interest

        System.out.println("Initial savings of $" + INIT_SAVINGS);
        System.out.println("at " + INTEREST_RATE + " yearly interest.\n");

        System.out.print("Enter years: ");
        userYears = scnr.nextInt();

        currSavings = INIT_SAVINGS;
        i = 1;
        while (i <= userYears) {
            System.out.println(" Savings in year " + i
                    + ": $" + currSavings);
            currSavings = currSavings + (currSavings * INTEREST_RATE);

            i = i + 1;
        }

        System.out.println();

        return;
    }
}