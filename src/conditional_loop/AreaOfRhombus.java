package conditional_loop;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diagonals of Rhombus");
        System.out.print("First Diagonal = ");
        double d1 = scanner.nextDouble();
        System.out.print("Second Diagonal = ");
        double d2 = scanner.nextDouble();
        double area = (d1 * d2 ) / 2;
        System.out.println("Area of Rhombhus = "+area);
    }
}
