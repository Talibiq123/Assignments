package conditional_loop;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle = ");
        int l = scanner.nextInt();
        System.out.print("Enter the width of Rectangle = ");
        int w = scanner.nextInt();
        int perimeter = 2 * (l + w);
        System.out.print("Perimeter of Rectangle = "+perimeter);
    }
}
