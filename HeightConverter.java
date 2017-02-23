import java.util.Scanner;

public class HeightConverter {
    /* Converts a height in feet/inches to centimeters */
    public static double feetInchesToCentimeters(int heightFeet, int heightInches) {
        final double CM_PER_IN = 2.54;
        final int INCH_PER_FT = 12;
        int totalInches = 0;
        double cmVal = 0.0;

        totalInches = (heightFt * INCH_PER_FT) + heightInches;
        cmVal = totalInches * CM_PER_IN;
        return cmVal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userFeet = 0;
        int userInches = 0;

        System.out.print("Enter feet: ");
        userFeet = scnr.nextInt();

        System.out.print("Enter inches: ");
        userInches = scnr.nextInt();

        System.out.print("Centimeters: ");
        System.out.println(feetInchesToCentimeters(userFeet, userInches));

        return;
    }
}