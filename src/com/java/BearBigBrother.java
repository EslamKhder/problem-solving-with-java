package com.java;

import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt(); // 4
        int value2 = scanner.nextInt(); // 7
        int counter = 0;
        while (value1 <= value2){ // 7 = 7
            value1 *= 3;
            value2 *=2;
            counter++;
        }
        System.out.println(counter);

    }
}
