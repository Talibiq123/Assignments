// 6. Input currency in Rupees and output in USD.
package firstjava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Currency Convertor");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter corrency in Rupees : ");
        double rupees = sc.nextDouble();
        double dollar = rupees / 82.64;
        System.out.println("Dollars in "+rupees+" rupees is "+dollar );
    }
}
