package com.java;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        while (size-- != 0){
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());
            for(int i =num1;i>0;i--) {
                int test = i;
                if (num1 % test == 0 && test % num2 != 0) {
                    System.out.println(test);
                    break;
                }
            }
        }
    }
}
