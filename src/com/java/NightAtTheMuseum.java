package com.java;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 97; // a
        int moves = 0;  // steps
        String value;   //  osm
        value = scanner.next();

        for(int i =0;i<value.length();i++){
            int result = Math.abs(value.toCharArray()[i] - start); // [111] - [97] = 14
            if(result <= 13){
                moves += result;
            } else {
                moves += (26-result); // 26 - 14 = 12
            }
            start = value.toCharArray()[i];
        }
        System.out.println(moves);
    }
}
