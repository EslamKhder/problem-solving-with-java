package com.java;

import java.util.Scanner;

public class CounterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        if(num1 %2 != 0){ //10 11
            num1++;
        }
        if(Math.abs(num1 - num2) <2){ // 2 4
            System.out.println(-1);
        }else {
            System.out.println(num1 + " " + (num1+1) + " " + (num1+2));
        }
    }
}
