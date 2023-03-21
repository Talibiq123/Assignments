// 5. Take two numbers as input and print the largest number.
package firstjava;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        System.out.println("Largest between two number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int max = (a > b)? a : b;
        System.out.println("Largest Number is " +max+".");
    }
}
