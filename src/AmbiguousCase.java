import java.util.Scanner;

public class AmbiguousCase {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter angle A in degrees:");
        double angleA = keyboard.nextDouble();
        System.out.println("Please enter side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double b = keyboard.nextDouble();
        keyboard.close();

        double h = b * Math.sin(Math.toRadians(angleA));

        if (angleA < 90) {
            if (a < h) {
                System.out.println("There is no triangle.");
            } else if (a == h) {
                System.out.println("There is a right triangle");
            } else if (a > b) {
                System.out.println("There is one triangle.");
            } else if (h < a && a < b) {
                System.out.println("There are two triangles (ambiguous case).");
            }
        } else {
            if (a < b || a == b) {
                System.out.println("There is no triangle.");
            } else {
                System.out.println("There is one triangle.");
            }
        }
    }
}