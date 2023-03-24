package conditional_loop;

import java.util.Scanner;

public class PerimeterOfParalellogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of Parallelogram = ");
        int b = scanner.nextInt();
        System.out.print("Enter the side of Parallelogram = ");
        int a = scanner.nextInt();
        int perimeter = 2 * (a + b);
        System.out.print("Perimeter of Parallelogram = "+perimeter);
    }
}
