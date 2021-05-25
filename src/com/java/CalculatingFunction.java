package com.java;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if(number %2 ==0){
            System.out.println(number/2);
        } else {
            System.out.println(-((number/2) + 1));
        }
    }
}
