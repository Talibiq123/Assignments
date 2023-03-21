package firstjava;

import java.util.Scanner;

public class AssignmentQuestionNine {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between two given numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scanner.nextInt();

        //
        for (int i = num1; i <= num2 ; i++) {
            int power = 0;
            int j = i;
            int l = i;
            while (i != 0) {
                power++;
                i = i / 10;
            }

            double sum = 0;
            int temp = j;
            while (temp > 0) {
                int lastdigit = temp % 10;
                sum = sum + Math.pow(lastdigit, power);
                temp = temp / 10;
            }
            if (sum == l) {
                System.out.println(l);
            }
        }


    }
}
