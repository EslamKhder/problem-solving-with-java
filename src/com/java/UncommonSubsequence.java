package com.java;

import java.util.Scanner;

public class UncommonSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value1 = scanner.next();
        String value2 = scanner.next();
        if(value1.equals(value2)){
            System.out.println(-1);
        } else if(value1.length() > value2.length()){
            System.out.println(value1.length());
        } else {
            System.out.println(value2.length());
        }
    }
}