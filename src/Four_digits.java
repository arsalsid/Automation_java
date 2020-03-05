import java.util.Scanner;
public class Four_digits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        double num1 = s.nextDouble();
        System.out.println("Enter your 2nd number");
        double num2 = s.nextDouble();
        System.out.println("Enter your 3rd number");
        double num3 = s.nextDouble();
        System.out.println("Enter your 4th number");
        double num4 = s.nextDouble();

        double sum = num1 + num4;
        System.out.println("Your Result is : " +sum);

    }

}
