package com.java;

import java.util.Scanner;

public class GoodNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int range = scanner.nextInt(); // 6
        String myNums = "0123456789";
        int con1 = 0;
        int con2 = 0;
        for (int i =0;i<size;i++) {
            String value = scanner.next();  // 0123456
            for (int x =0;x<range + 1;x++) {
                if (value.contains(myNums.substring(x, x + 1))) {
                    con1++; // 7
                }
            }
            if (con1 >= range + 1) {
                con2++;
            }
            con1 = 0;
        }
        System.out.println(con2);
    }
}