import java.util.Scanner;
public class FirstandLastdigit1 {
    public static void main(String[] args) {

        int number, first_digit , last_digit;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your wish number : ");
        int num = s.nextInt();

        first_digit = num;
        while (first_digit >= 10)
        {
            first_digit = first_digit / 10;
        }

        last_digit = num % 10;

        System.out.println("\n Your first number is : " + num + "=" +" " +first_digit);
        System.out.println("\n Your Second number is : " + num + "=" +" " +last_digit);
    }
}
