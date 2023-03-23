package conditional_loop;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the Parallelogram = ");
        double h = scanner.nextInt();
        System.out.print("Enter the Base of the Parallelogram = ");
        double b = scanner.nextInt();

        double area = h * b;

        System.out.print("Area of the Parallelogram = "+area);
    }
}
