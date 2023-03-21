package firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principle : ");
        double p = in.nextDouble();

        System.out.print("Enter rate : ");
        double r = in.nextDouble();

        System.out.print("Enter time : ");
        int t = in.nextInt();

        double SI = ( p * t * r ) / 100;

        System.out.println("Simple Interest is "+SI);
    }
}
