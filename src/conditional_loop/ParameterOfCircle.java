package conditional_loop;

import java.util.Scanner;

public class ParameterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of Circle = ");
        double r = scanner.nextInt();
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle = "+perimeter);
    }
}
