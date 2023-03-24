package conditional_loop;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of Sphere = ");
        double r = scanner.nextDouble();
        double volume = (4 * Math.PI * r * r * r ) / 3;
        System.out.print("Volume of Sphere = "+volume);
    }
}
