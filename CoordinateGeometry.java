import java.util.Scanner;
import java.lang.Math;
// ELEMENTARY LEVEL
public class CoordinateGeometry {

//    public static double distanceCalculation(double x1, double x2, double y1, double y2){
//        pointsDistance = Math.sqrt(Math.pow(x2 - x1 , 2.0) + Math.pow(y2 - y1 ,2.0));
//        return pointsDistance;
//    }

    public static void main(String [] args) {
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 1.0;
        double y2 = 5.0;
        double pointsDistance = 0.0;

        pointsDistance = Math.sqrt(Math.pow(x2 - x1 , 2.0) + Math.pow(y2 - y1 ,2.0));


        System.out.print("Points distance: ");
        System.out.println(pointsDistance);

        return;
    }
}