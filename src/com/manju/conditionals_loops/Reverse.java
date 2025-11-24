package com.manju.conditionals_loops;

public class Reverse {
    static void main() {
        int n=23597;
        int ans =0;
        while(n>0){
            int rem=n%10;
            n /=10;
            ans =ans *10+rem;


        }
        System.out.println(ans);
    }
}
