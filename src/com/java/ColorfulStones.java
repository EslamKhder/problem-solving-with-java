package com.java;

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        /*
        RGB
        RRR
         */
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String instraction =  scanner.next();
        int counter = 1; // R
        int x = 0; // R
        for(int i=0;i<instraction.length();i++){
            if(value.toCharArray()[x] == instraction.toCharArray()[i]){
                counter++;
                x++;
            }
        }
        System.out.println(counter);

    }
}
