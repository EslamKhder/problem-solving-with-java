package com.java;

import java.util.Scanner;

public class FafaCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employees = scanner.nextInt();
        if(employees % 2 == 0){
            System.out.println(employees / 2);
            return;
        }
        System.out.println((employees-1)/2);
    }
}
