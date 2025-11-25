package com.manju.switch_statement;
import java.util.Scanner;
public class Describe_Fruit {
    static void main() {
        Scanner in =new Scanner(System.in);
        String fruit =in.next();

//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//
//            case "Apple":
//                System.out.println("Kashmir famous fruit");
//                break;
//
//            case "Orange":
//                System.out.println("Citrus family");
//                break;
//
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//
//            default:
//                System.out.println("please enter a valid fruit");
//        }

        // Enhanced switch
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Kashmir famous fruit");
            case "Orange" -> System.out.println("Citrus family");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }

    }
}
