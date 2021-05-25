package com.java;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 20
        int val1 = scanner.nextInt(); // 2
        int val2 = scanner.nextInt(); // 5
        int sum = 0;

        for (int i =1;i<=num;i++) { //
            if(i/10 == 0){
                if(i >= val1 && i<= val2){ //
                    sum += i;
                }
            } else {
                int number = i; // 15   // number = 0
                int mysum = 0;
                while (number !=0) { // 15
                    int mynum = number%10; // 1
                    mysum += mynum; // 5 + 1
                    number /= 10;   // 15 / 10 = 1
                }
                if(mysum >= val1 && mysum <= val2){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
