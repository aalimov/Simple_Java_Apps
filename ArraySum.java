import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num_elements;
        int i = 0;
        int sumVal = 0;

        System.out.println("Enter array length");
        num_elements = scnr.nextInt();
        int[] userVals = new int[num_elements];


        System.out.println("Enter " + num_elements + " integer values...");
        for (i = 0; i < num_elements; ++i) {
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }


        sumVal = 0;

        for (i = 0; i < num_elements; ++i) {
            sumVal = sumVal + userVals[i];
        }
        System.out.println("Sum: " + sumVal);

        return;
    }
}