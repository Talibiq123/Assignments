package conditional_loop;

import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of Equilateral Triangle : ");
        double side = scanner.nextInt();

        double area = Math.sqrt(3) * Math.pow(side, 2) / 4;

        System.out.print("Area of Equilateral Triangle = "+area);
    }
}
