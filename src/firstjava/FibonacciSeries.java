// 7. To calculate Fibonacci Series up to n numbers.
package firstjava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter till where series is to be printed : ");
        int n = in.nextInt();
        System.out.print("0     ");
        System.out.print("1     ");
        int num1 = 0;
        int num2 = 1;
        int i = 0;
        while ( i <= n) {
            int sum = num1 + num2;
            System.out.print(+sum+"      ");
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}
