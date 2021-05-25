package com.java;

import java.util.Scanner;

public class Shape2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i =1;i<=num;i++) {
            for (int z = i;z<=num;z++){
                System.out.print(" ");
            }
            for (int z = i;z<=num;z++){
                System.out.print("*");
            }
        }
    }
}