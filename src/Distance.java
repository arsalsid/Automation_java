import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        int meter= 1000;
        double feet = 3280.8399;
        double inches = 39370.078;
        int centimeters = 100000;

            // Get input from users
        Scanner Distance = new Scanner(System.in);
        System.out.println("Enter your Kilometer :");

                // Convert integer into double
        double Kilometer = Distance.nextDouble();
        double Meter = Kilometer * meter;
        double Feets = Kilometer * feet;
        double Inches = Kilometer * inches;
        double Centimeters = Kilometer * centimeters;


        System.out.println("Total Meter is : " +Meter);
        System.out.println("Total Feets is : " +Feets);
        System.out.println("Total Inches is : " +Inches);
        System.out.println("Total Centimeter is : " +Centimeters);




    }
}
