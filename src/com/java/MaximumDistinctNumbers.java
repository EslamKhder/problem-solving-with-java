package com.java;

import java.util.Scanner;

public class MaximumDistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();  // 15
        double res = 0;
        for (long i =1;i<num;i++) { // 1   15
            long sum = (i*(i+1))/2;
            if(sum > num){
                System.out.println(i -1);
                break;
            }
        }
    }
}
