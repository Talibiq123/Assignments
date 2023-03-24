package conditional_loop;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of Square = ");
        int side = scanner.nextInt();
        int perimeter = 4 * side;
        System.out.print("Perimeter of Square = "+perimeter);
    }
}
