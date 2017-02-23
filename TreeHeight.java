import java.util.Scanner;
import java.lang.Math;
// Calculate tree height based on length of shadow. (dont use at night ;) or most other times really. )
public class TreeHeight {
    public static void main(String [] args) {
        double treeHeight     = 0.0;
        double shadowLength   = 0.0;
        double angleElevation = 0.0;

        angleElevation = 0.11693706; // 0.11693706 radians = 6.7 degrees
        shadowLength   = 17.5;

        //tan(angleElevation) = treeHeight / shadowLength
        treeHeight = Math.tan(angleElevation) * shadowLength;
        System.out.print("Tree height: ");
        System.out.println(treeHeight);

        return;
    }
}