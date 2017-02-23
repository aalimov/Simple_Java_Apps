
import java.util.Scanner;

public class CelsiusToFahrenheit {


    public static double c_to_f_conversion(double tempF, double tempC) {
        tempF = tempC * (9 / 5) + 32;
        return tempF;
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double tempF = 0.0;
        double tempC = 0.0;

        System.out.println("Enter temperature in Celsius: ");
        tempC = scnr.nextDouble();

        tempF = c_to_f_conversion(tempF, tempC);
        System.out.print("Fahrenheit: ");
        System.out.println(tempF);

        return;
    }
}
