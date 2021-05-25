package com.java;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        String row= "qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
        String result = "";
        Scanner scanner = new Scanner(System.in);
        char direction = scanner.next().charAt(0);
        String word = scanner.next();
            for (int i =0;i<word.length();i++) {
                for (int x = 0; x < row.length(); x++) {
                    if (word.toCharArray()[i] == row.toCharArray()[x]) {
                        if (direction == 'R') {
                            result += row.toCharArray()[x - 1];
                        } else {
                            result += row.toCharArray()[x + 1];
                        }

                    }
                }
            }
        System.out.print(result);

    }
}
