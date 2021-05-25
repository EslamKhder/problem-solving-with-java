package com.java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        if (num == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
// 1   = 1
// 2   = 2 *1    2
//3    = 3 * 2 * 1 = 6
// 4  = 4 *  3 * 2 * 1  = 24