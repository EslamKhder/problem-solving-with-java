package com.java;

import java.util.Scanner;

public class MishkaAndGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        int cou1 = 0;
        int cou2 = 0;
        for (int i =0;i<rounds;i++){
            int val1 = scanner.nextInt();
            int val2 = scanner.nextInt();
            if(val1 > val2){
                cou1++;
            } else if(val2 > val1){
                cou2++;
            }
        }
        if(cou1 > cou2){
            System.out.println("Mishka");
        } else if (cou2 > cou1){
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
