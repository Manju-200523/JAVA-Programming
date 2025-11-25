package com.manju.switch_statement;
import java.util.Scanner;
public class Display_Day {
    static void main() {
        Scanner in =new Scanner(System.in);

        int day=in.nextInt();


        //Weekdays

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
//

        //Weekdays - Weekends
        switch(day){


            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;

            case 6:
            case 7:
                System.out.println("Weekends");
                break;


        }
    }
}
