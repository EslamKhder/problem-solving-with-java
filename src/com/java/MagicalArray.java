package com.java;

import java.util.Scanner;

public class MagicalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long []arr = new long[num];
        long counter = num;
        for (int i=0;i<num;i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<num;i++) {
            long val = arr[i];
            for (int x =i+1;x<num;x++){
                if(arr[x] == val){
                    counter++;
                } else {
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}