package com.manju.conditionals_loops;
import java.util.Scanner;
public class Fibonacci {
    static void main() {
//        Scanner in =new Scanner(System.in);
        int a=0;
        int b=1;
        for (int n=2;n<=7;n++){
            int temp=b;
            b=a+b;
            a=temp;


        }
        System.out.println(b);
    }
}
