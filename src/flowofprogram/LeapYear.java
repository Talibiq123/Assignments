package flowofprogram;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000; //take any year
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
