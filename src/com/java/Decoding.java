package com.java;

import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String text = scanner.next();
        String newText = "";
        int i = 0;

        while (num != 0) {
            if(num % 2 != 0){
                newText = newText + text.toCharArray()[i];
            } else {
                newText = text.toCharArray()[i] + newText;
            }
            num--;
            i++;
        }
        System.out.println(newText);

    }
}