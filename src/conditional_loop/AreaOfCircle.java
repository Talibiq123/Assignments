package conditional_loop;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of Circle = ");
        double r = scanner.nextDouble();

        double area = Math.PI * Math.pow(r, 2.0);

        System.out.println("Area of the Circle = "+area);
    }
}
