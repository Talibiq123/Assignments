// 2. Take name as input and print a greeting message for that particular name.
package firstjava;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = in.nextLine();
        System.out.println("Hello, " +name+"!");
    }
}
