import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Marks : ");
        double m1 = s.nextDouble();
        System.out.println("Enter your Marks : ");
        double m2 = s.nextDouble();
        System.out.println("Enter your Marks : ");
        double m3 = s.nextDouble();
        System.out.println("Enter your Marks : ");
        double m4 = s.nextDouble();
        System.out.println("Enter your Marks : ");
        double m5 = s.nextDouble();

        double Marks = m1 + m2 + m3 + m4 + m5;
        double Result = ((Marks / 500) * 100);
        System.out.println("Your Percentage is  :" +Result);

        if (Marks > 90)
            System.out.println("Grade A1");

        else {
            System.out.println("Grade A");
        }

        if (Marks < 70)
            System.out.println("Grade B");

        else {
            System.out.println("Grade C");
        }
//
//        if (Marks == 50)
//            System.out.println("Below Average");
//
//        else {
//            System.out.println("Fail");
//        }
    }
}
