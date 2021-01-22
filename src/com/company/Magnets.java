package com.company;


import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMagnets = scanner.nextInt();
        String temp = "";
        int counter = 0;
        String num = null;
        if(numMagnets == 1){
            System.out.println(1);
            return;
        }
        if(numMagnets == 2){
            System.out.println(2);
            return;
        }
        for (int i=0;i<numMagnets;i++) {
            num = scanner.next();
            if(!temp.isEmpty() && temp.toCharArray()[1] != num.toCharArray()[0]){
                counter++;
            }
            temp = num;
        }
        System.out.println(counter);
    }
}