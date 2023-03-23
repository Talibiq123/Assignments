package conditional_loop;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length & Breadth of Rectangle");
        System.out.print("Length = ");
        double l = scanner.nextInt();
        System.out.print("Breadth = ");
        double b = scanner.nextInt();

        // Area
        double area = l * b;

        System.out.println("Area of Rectangle = "+area);
    }
}
