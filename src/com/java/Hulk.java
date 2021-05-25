package com.java;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for(int i =1;i<=size;i++){

            if(i == size){
                if(i % 2 == 0){
                    System.out.print("I love it ");
                } else {
                    System.out.print("I hate it ");
                }
            } else {
                if(i % 2 == 0){
                    System.out.print("I love that ");
                } else {
                    System.out.print("I hate that ");
                }
            }


        }
    }
}
