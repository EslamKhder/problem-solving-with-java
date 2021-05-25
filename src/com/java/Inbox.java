package com.java;

import java.util.Scanner;

public class Inbox {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int squSize = scanner.nextInt();
            int [] numbers = new int[squSize];
            int ones = 0;
            for (int i=0;i<squSize;i++){
                numbers[i] = scanner.nextInt();
                if(numbers[i] == 1){
                    ones++;
                }
            }
            int counter = 0;
            for (int i=0;i<squSize - 1;i++){
                if(numbers[i] == 1){
                    ones--;
                    if(ones > 0){
                        counter += 2;
                        if(numbers[i+1] == 1){
                            counter--;
                        }
                    } else {
                        counter++;
                    }
                }
            }
            if(numbers[squSize-1] == 1) {
                counter++;
            }
            System.out.println(counter);
        }
}

