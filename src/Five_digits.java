import java.util.Scanner;

public class Five_digits {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Enter your 1st Number : " );
        double num1= s.nextDouble();
        System.out.println("Enter your 2nd Number : " );
        double num2 = s.nextDouble();
        System.out.println("Enter your 3rd Number : " );
        double num3 = s.nextDouble();
        System.out.println("Enter your 4th Number : " );
        double num4 = s.nextDouble();
        System.out.println("Enter your 5th Number : " );
        double num5 = s.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Your total sum is : " +sum);
    }
}
