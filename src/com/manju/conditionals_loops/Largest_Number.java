package com.manju.conditionals_loops;

import java.util.Scanner;

public class Largest_Number {
    static void main() {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        //normal version

//        if (num1>num2){
//            if(num1>num3){
//                System.out.println("Largest number is =" +num1);
//            }else{
//                System.out.println("Largest number is =" +num3);
//            }
//        }else if(num2>num3){
//            System.out.println("Largest number is =" +num2);
//        }else{
//            System.out.println("Largest number is =" +num3);
//        }

        //simpler version

//        int max=num1;
//        if(num2>max){
//            max=num2;
//        }
//        if(num3>max){
//            max=num3;
//        }
//        System.out.println("Largest number is =" + max);

        //more optimised

        int max=Math.max(num3,Math.max(num1,num2));
        System.out.println(max);
    }
}



