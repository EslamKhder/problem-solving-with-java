package com.company;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num % 2 == 0) {
            System.out.println(num / 2);
        } else {
            System.out.println(-(num+1)/2);
        }
    }
}
