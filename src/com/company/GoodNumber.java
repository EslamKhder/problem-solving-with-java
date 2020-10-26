package com.company;

import java.util.Scanner;
public class GoodNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int range = scanner.nextInt();
        int result = 0;
        int counter = 0;
        for (int i = 0; i < size; i++) { // size = 2
            String num = scanner.next(); // num =  1
            for (int x = 0; x < num.length(); x++) { // num.length =  1
                counter = 0;
                for (int z = 0; z <= range; z++) { /// range =  1
                    if ((num.contains(String.valueOf(z)))) {
                        counter++;
                    }
                }
            }
            if (counter == range + 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}