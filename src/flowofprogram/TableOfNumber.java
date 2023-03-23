// Print of the table of the given number
package flowofprogram;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num +" * "+ i + " = "+i*num);
        }
    }
}
