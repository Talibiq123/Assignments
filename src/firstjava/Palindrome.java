// 8. To find out whether the given String is Palindrome or Not.
package firstjava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        int l = 0;
        int r = str.length() - 1;
        boolean ans = false;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                ans = true;
            }
            l++;
            r--;
        }
        if (ans) {
            System.out.println(str +" is a Palindrome.");
        } else {
            System.out.println(str +" is not a Palindrome.");
        }
    }
}
