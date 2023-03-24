package conditional_loop;

import java.util.Scanner;

public class ParameterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Side of Equilateral Triangle = ");
        int side = scanner.nextInt();

        int perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle = "+perimeter);
    }
}
