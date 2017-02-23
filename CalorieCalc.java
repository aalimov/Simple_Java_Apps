import java.util.Scanner;

public class CalorieCalc {
    // Method converts steps to feet walked
    public static int stepsToFeet(int baseSteps) {
        final int FEET_PER_STEP = 3;  // Unit conversion
        int feetTot = 0;              // Corresponding feet to steps

        feetTot = baseSteps * FEET_PER_STEP;

        return feetTot;
    }

    // Method converts steps to calories burned
    public static double stepsToCalories(int baseSteps) {
        final double STEPS_PER_MINUTE = 70.0;            // Unit Conversion
        final double CALORIES_PER_MINUTE_WALKING = 3.5;  // Unit Conversion
        double minutesTot = 0.0;                         // Corresponding min to steps
        double caloriesTot = 0.0;                        // Corresponding calories to min

        minutesTot = baseSteps / STEPS_PER_MINUTE;
        caloriesTot = minutesTot * CALORIES_PER_MINUTE_WALKING;

        return caloriesTot;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int stepsInput = 0;      // User defined steps
        int feetTot = 0;         // Corresponding feet to steps
        double caloriesTot = 0;  // Corresponding calories to steps

        // Prompt user for input
        System.out.print("Enter number of steps walked: ");
        stepsInput = scnr.nextInt();

        // Call methods to convert steps to feet/calories
        feetTot = stepsToFeet(stepsInput);
        System.out.println("Feet: " + feetTot);

        caloriesTot = stepsToCalories(stepsInput);
        System.out.println("Calories: " + caloriesTot);

        return;
    }
}