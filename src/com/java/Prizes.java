package com.java;

import java.util.Scanner;

public class Prizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStages = scanner.nextInt();
        int arr [] = new int[numStages];
        for(int i=0;i<numStages;i++){
            arr[i] = scanner.nextInt();
        }
        int prize [] = new int[5];
        for(int i=0;i<5;i++){
            prize[i] = scanner.nextInt();
        }
        long myPrizes [] = new long[5];
        int score = 0;
        for(int i=0;i<numStages;i++){
            score += arr[i]; // 3
            for(int x = 4;x>=0;x--){
                int result = score / prize[x]; // 1 = 2
                myPrizes[x] += result;
                score -= result * prize[x];
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(myPrizes[i] + " ");
        }
        System.out.println();
        System.out.println(score);
    }
}
