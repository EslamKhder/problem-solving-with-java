package com.java;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong(); // 3
        // sum = (n * (n+1)) / 2
        long sum = (num*(num+1)) / 2;
        System.out.println(sum);
    }
}
