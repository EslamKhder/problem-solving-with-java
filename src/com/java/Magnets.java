package com.java;


import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMg = scanner.nextInt();

        int oldMg = 0;
        int newMg;
        int cou = 0;
        for(int i=0;i<numMg;i++){
            newMg = scanner.nextInt();
            if(newMg != oldMg){
                cou++;
            }
            oldMg = newMg;
        }
        System.out.println(cou);
    }
}
