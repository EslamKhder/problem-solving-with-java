package com.java;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char []word = scanner.next().toCharArray();
        int wordLength = word.length;
        int counter = 0;
        for (int i =0;i<wordLength/2;i++){
            for (int x =wordLength-1;x<=wordLength/2;x--){
                if(word[i] == word[x]){
                    counter++;
                }
            }
        }
        System.out.println(wordLength - counter);
    }
}
