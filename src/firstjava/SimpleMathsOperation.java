// Write a program to
package firstjava;

import java.util.Scanner;

public class SimpleMathsOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter other number : ");
        int num2 = in.nextInt();
        System.out.print("Enter an Operator : ");
        char op = in.next().charAt(0);
        if (op == '+') {
            int add = num1 + num2;
            System.out.println("sum is "+add);
        } else if (op == '-') {
            int diff = num1 - num2;
            System.out.println("Difference is "+ diff);
        } else if (op == '*') {
            int mul = num1 * num2;
            System.out.println("Multiplication is "+mul);
        } else if (op == '/') {
            int div = num1 / num2;
            System.out.println("Division is "+ div);
        } else {
            System.out.println("Please, Enter correct numbers or operators");
        }
    }
}
