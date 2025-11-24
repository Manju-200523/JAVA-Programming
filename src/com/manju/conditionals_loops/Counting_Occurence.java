package com.manju.conditionals_loops;

import java.util.Scanner;
public class Counting_Occurence {
    static void main() {
        int n=13839;
        int count =0;
        while(n>0){
            int rem = n%10;
            if(rem==3) {
                count++;
            }
            n=n/10; //n /=10
        }
        System.out.println(count);
    }
}
