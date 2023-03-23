//2. Take two numbers and print the sum of both.
package flowofprogram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of given numbers = "+sum);
    }
}
