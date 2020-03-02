import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {

        int m= 1000;

        Scanner Distance = new Scanner(System.in);
        System.out.println("Enter your Kilometer :");

        double Kilometer = Distance.nextDouble();
        double Meter = Kilometer * m;

        System.out.println("Total Meter is :" +Meter);
//
//        System.out.println("Enter your Distance in Meter : ");
//        System.out.println("Enter your Distance in feets : ");
//        System.out.println("Enter your Distance in inches : ");
//        System.out.println("Enter your Distance in centimeter: ");




    }
}
