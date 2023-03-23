package conditional_loop;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the Triangle = ");
        double h = scanner.nextInt();
        System.out.println("Enter the Base of the Triangle = ");
        double b = scanner.nextInt();

        double area = (h * b) / 2;

        System.out.println("Area of the Triangle = "+area);
    }
}
