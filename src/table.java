import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        //        Scanner t = new Scanner(System.in);
//        System.out.println("Enter your number :");
//        int table = t.nextInt();
//
//        for (int i =1; i <=10; i++){
//
//            System.out.println(table +"x" +i +"=" +(table * i));
//
//        }
//    }
       // int total = 1;

//        for (int i = 1; i <= 5; i++) { //for column check krta
//
//            for (int j = 1; j <= i ; j++) { //row check krta
//
//                System.out.print(i);
//               //total = total;
//            }
//            System.out.println();
//        }

        int counter = 1;

        for (int i = 1; i <=7 ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print(j);
            }
            System.out.println();

            for (int k = 1; k < counter  ; k++) {

                System.out.print("*");
            }
        }
    }
}
