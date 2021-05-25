package com.java;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 512
        int operation = scanner.nextInt();  // 4

        for(int i =0;i<operation;i++){
            if(number%10 == 0){
                number /= 10;
                continue;
            }
            number--;
        }
        System.out.println(number);

    }
}
