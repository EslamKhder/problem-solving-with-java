package com.java;

import java.util.Scanner;

public class GeorgeAccommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter = 0;
        for(int i =0;i<size;i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if(num2 - num1 >= 2){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
