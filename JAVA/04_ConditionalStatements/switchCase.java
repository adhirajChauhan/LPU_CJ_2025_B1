// import java.util.Scanner;

// public class switchCase {
//     public static void main(String[] args) {
//         //switch case

//         // switch(condition){
//         //     case 1:
//         //     code
//         //     break;

//         //     case 2:
//         //     code
//         //     break;

//         //     case 3:
//         //     code
//         //     break;
//         // }

//         // Example 1
//         // int day = 5;

//         // switch(day){
//         //     case 1 :
//         //     System.out.println("Monday");
//         //     break;

//         //     case 2:
//         //     System.out.println("Tuesday");
//         //     break;

//         //     case 3:
//         //     System.out.println("Wednesday");
//         //     break;

//         //     case 4:
//         //     System.out.println("Thursday");
//         //     break;

//         //     case 5:
//         //     System.out.println("Friday");
//         //     // break;

//         //     case 6:
//         //     System.out.println("Saturday");
//         //     // break;

//         //     case 7:
//         //     System.out.println("Sunday");
//         //     break;

//         //     default:
//         //     System.out.println("Error");

//         // }

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter total cost");
//         double totalCost = sc.nextDouble();

//         int payment;
//         if(totalCost <= 1000) payment = 1;
//         else if(totalCost <= 5000) payment = 2;
//         else payment = 3;

//         switch(payment){
//             case 1:
//             System.out.println("card");
//         }

//     }
// }

// // switch case
// //take a user input and check if the number falls into the following range
// // 0 - 10 -> "LOW"
// // 11 - 20 -> "MEDIUM"
// // 21 - 30 -> "HIGH"
// //apart from these ranges, print "Out of range"

import java.util.*;

class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double no = sc.nextDouble();
        int check;

        if (no >= 0 && no <= 10) {
            check = 1;
        } else if (no > 10 && no <= 20) {
            check = 2;
        } else {
            check = 3;
        }

        switch (check) {
            case 1:
                System.out.print("Low");
                break;
            case 2:
                System.out.print("Medium");
                break;
            case 3:
                System.out.print("High");
                break;
            default:
                System.out.print("Error 404: Not Found");
        }
    }
}