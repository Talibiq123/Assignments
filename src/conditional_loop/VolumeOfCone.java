package conditional_loop;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter of Height of Cone = ");
        int h = scanner.nextInt();
        System.out.print("Enter of Radius of Cone = ");
        int r = scanner.nextInt();
        double vol = (Math.PI * r * r * h) / 3;
        System.out.print("Volume of Cone = "+Math.abs(vol));
    }
}
