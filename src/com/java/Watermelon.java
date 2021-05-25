package com.java;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num <= 2){
            System.out.println("NO");
            return;
        }
        if(num % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
