// 9. To find whether given number is Armstrong or not.
package firstjava;

import java.util.Scanner;
import java.math.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter First Number : ");
        //int num1 = scanner.nextInt();
        //System.out.print("Enter Second Number : ");
        //int num2 = scanner.nextInt();
        System.out.print("Enter a Number : ");
        int n = scanner.nextInt();
        int m = n;
        int fi = n;
        int power = 0;


        // find number of power in a given number
        while (n != 0) {
            power++;
            n = n / 10;
        }
        //System.out.println(power);

        //Armstrong number
        double sum = 0;
        double digit;
        while (m != 0) {
            digit = m  % 10;
            sum = sum + Math.pow(digit, power);
            m = m / 10;
        }
        if (sum == fi) {
            System.out.println(fi +" is an Armstrong number.");
        } else {
            System.out.println(fi +" is not an Armstrong number.");
        }

    }
}
