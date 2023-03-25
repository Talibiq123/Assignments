package conditional_loop;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Side of the Cube = ");
        int a = scanner.nextInt();
        int surface_area = (int) (6 * Math.pow(a, 2.0));
        System.out.print("Total Surface Area of Cube = "+surface_area);
    }
}
