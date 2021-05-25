package com.java;

import java.util.Scanner;

public class AnotherDust {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextInt(); // 1
        long num2 = scanner.nextInt();  // 2
        long num3 = scanner.nextInt();  // 3

        long aChar = num1 + num3; // 1 + 3
        long bChar = num2 + num3; // 2 + 3

        if(aChar > bChar){
            System.out.println((bChar*2) + 1);
        } else if(bChar > aChar){
            System.out.println((aChar*2) + 1);
        } else {
            System.out.println(aChar + bChar);
        }

    }
}
