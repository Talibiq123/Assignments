package conditional_loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = scanner.nextInt();
        int sum = 0;
        int s0 = 0;
        int s1 = 1;
        System.out.print("0  1  ");
        for (int i = 2; i < num; i++) {
            sum = s0 + s1;
            System.out.print(sum +"  ");
            s0 = s1;
            s1 = sum;
        }
    }
}
