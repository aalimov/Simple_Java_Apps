import java.util.Scanner;

// MaxSum of TWO Max calls
public class SumOfMax {
    public static double findMax(double num1, double num2) {
        double maxVal = 0.0;


        if (num1 > num2) {
            maxVal = num1;
        }
        else {
            maxVal = num2;
        }
        return maxVal;
    }

    public static void main(String [] args) {
        double numA = 5.0;
        double numB = 10.0;
        double numY = 3.0;
        double numZ = 7.0;
        double maxSum = 0.0;

        //DE-COMMENT FOR USE WITHOUT PRESET num VALUES
        //Scanner scnr = new Scanner(System.in);
        //numA = scnr.nextDouble();
        //numB = scnr.nextDouble();
        //numC = scnr.nextDouble();
        //numD = scnr.nextDouble();

        maxSum = findMax(numA, numB) + findMax(numY, numZ);

        System.out.print("maxSum =: " + maxSum);

        return;
    }
}