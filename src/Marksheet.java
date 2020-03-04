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

        if(Marks >= 90)
        {
            System.out.println("Grade A1");
        }
        else if (Marks >= 80)
        {
            System.out.println("Grade A");
        }
        else if (Marks >= 70 )
        {
            System.out.println("Grade B");
        }
        else if(Marks >= 60)
        {
            System.out.println("Grade C");
        }
        else if (Marks >= 50)
        {
            System.out.println("Grade : D");
        }
        else
            {
            System.out.println("Fail");
        }
        System.out.println("Your Grade is : " +Marks);
    }
}
