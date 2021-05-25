package com.java;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins = scanner.nextInt(); // 10

        while (coins != 1){  // 5 != 1
            System.out.print(coins + " ");  //   10 5
            for(int i = 2;i<=coins;i++){
                if(coins % i == 0){  // 10 % 2 == 0
                    coins /= i;    // coins = 10 / 2 = 5   // coins = 5 / 5 = 1
                    break;
                }
            }
        }
        System.out.println(coins);

    }
}
