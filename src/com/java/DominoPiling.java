package com.java;

import java.util.Scanner;

public class DominoPiling {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long num1 = scanner.nextInt(); // 1
            long num2 = scanner.nextInt();  // 2
            long result = num1 * num2; // 9
            System.out.println(result / 2);
        }
}
