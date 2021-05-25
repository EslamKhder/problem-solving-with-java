package com.java;

import java.util.Scanner;

public class Criminals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCity = scanner.nextInt(); // 6
        int position = scanner.nextInt();
        int sum = 0;
        int []arr = new int[numCity + 1]; // 7  1 2 3 4 5 6
        for (int i=1;i<=numCity;i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        for (int i=1;i<position && i <= numCity-position;i++) {
            if(arr[position + i] + arr[position - i] == 1){
                sum--;
            }
        }
        System.out.println(sum);
    }
}
