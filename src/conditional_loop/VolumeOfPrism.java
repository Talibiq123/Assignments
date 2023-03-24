package conditional_loop;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        System.out.println("Only for Hexagonal Prism");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Apothem Length of Prism = ");
        int a = scanner.nextInt();
        System.out.print("Enter the Base Length of Prism = ");
        int b = scanner.nextInt();
        System.out.print("Enter the Height Length of Prism = ");
        int h = scanner.nextInt();
        int volume = 3 * a * b * h;
        System.out.print("Volume of Prism = "+volume);
    }
}
