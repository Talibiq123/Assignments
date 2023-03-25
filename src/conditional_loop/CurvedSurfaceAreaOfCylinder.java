package conditional_loop;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Radius of Cylinder = ");
        double r = scanner.nextDouble();
        System.out.print("Enter the Height of Cylinder = ");
        double h = scanner.nextDouble();
        double surface_area = 2 * Math.PI * r * r * h;
        System.out.print("Curved Surface Area of Cylinder is = "+surface_area);
    }
}
