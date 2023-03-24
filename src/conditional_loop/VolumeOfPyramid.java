package conditional_loop;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of Pyramid = ");
        double l = scanner.nextDouble();
        System.out.print("Enter the Base Width of Pyramid = ");
        double w = scanner.nextDouble();
        System.out.print("Enter the Height of Pyramid = ");
        double h = scanner.nextDouble();
        double volume = (l * w * h) / 3;
        System.out.print("Volume of the Pyramid = "+volume);
    }
}
