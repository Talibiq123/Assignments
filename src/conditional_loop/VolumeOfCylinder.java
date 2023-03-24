package conditional_loop;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of Cylinder = ");
        int r = scanner.nextInt();
        System.out.print("Enter the Height of Cylinder = ");
        int h = scanner.nextInt();
        int volume = (int) (Math.PI * r * r * h);
        System.out.print("Volume of Prism = "+volume);
    }
}
