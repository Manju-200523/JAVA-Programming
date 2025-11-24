package com.manju.conditionals_loops;
import java.util.Scanner;
public class AlphabetCase_Check {
    static void main() {
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if (ch >='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}







