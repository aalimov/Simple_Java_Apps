import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num_elements;
        int i = 0;
        int maxVal = 0;

        System.out.println("Enter array length");
        num_elements = scnr.nextInt();
        int[] userVals = new int[num_elements];



        // Prompt user to populate array
        System.out.println("Enter " + num_elements + " integer values...");

        for (i = 0; i < num_elements; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }

        // Determine largest (max) number
        maxVal = userVals[0]; // Largest so far

        for (i = 0; i < num_elements; ++i) {
            if (userVals[i] > maxVal) {
                maxVal = userVals[i];
            }
        }
        System.out.println("Max: " + maxVal);

        return;
    }
}