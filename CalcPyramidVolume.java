import java.util.Scanner;

public class CalcPyramidVolume {
    //Volume = base area x height x 1/3
    //Base area = base length x base width
    public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {
        double volume;

        volume = ((baseLength * baseWidth) * pyramidHeight / 3);
        return volume;
    }
    public static void main (String [] args) {
        double baseLength;
        double baseWidth;
        double pyramidHeight;

        Scanner scnr = new Scanner(System.in);

        System.out.println(" Pyramid Base Length: ");
        baseLength = scnr.nextDouble();
        System.out.println(" Pyramid Base Width: ");
        baseWidth = scnr.nextDouble();
        System.out.println(" Pyramid Height: ");
        pyramidHeight = scnr.nextDouble();

        System.out.println(" Volume is: " + pyramidVolume(baseLength, baseWidth, pyramidHeight));
        return;
    }
}