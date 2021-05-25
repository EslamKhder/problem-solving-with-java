package com.java;

import java.util.Scanner;

// 65 A B 66
// 97 a b 98
// 32
public class Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int cha = (int)ch;
        if(cha >= 97){
            System.out.println((char) (cha - 32));
        } else {
            System.out.println((char) (cha + 32));
        }
    }
}
