import  java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

            //Get input from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Basic Salary : ");

        //Convert String values into Double
        double Basic_Salary = Double.parseDouble(s.nextLine());

            //Calculate Allowances fo Basic Salary
        System.out.println("Your Gross Salary is :");
        double Dearness_Allowance = Basic_Salary * .40;
        double Rent_Allowance = Basic_Salary * .20;

            //Get Gross salary
        double Gross_Salary = Basic_Salary + Dearness_Allowance  + Rent_Allowance;
        System.out.println(Gross_Salary);

    }
}
