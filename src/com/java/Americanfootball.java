package com.java;

import java.util.Scanner;

public class Americanfootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPlayers = scanner.nextInt(); // 5
        int minHigh = scanner.nextInt();
        int maxHigh = scanner.nextInt();
        int totalHigh = scanner.nextInt();

        int Min = maxHigh + (minHigh * (numPlayers - 1));
        int Max = minHigh + (maxHigh * (numPlayers - 1));

        if(totalHigh <= Max && totalHigh >= Min){ // 13 <= 18 && 13 >= 12
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
/*
* (10,20)    15
*  15 >=10  && 15 <=20
* */