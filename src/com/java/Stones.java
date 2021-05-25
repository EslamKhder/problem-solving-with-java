package com.java;

import java.util.Scanner;

public class Stones {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt(); //5
            String value = input.next();
            int counter = 0;
            char []values = value.toCharArray();
            for (int i =0;i<num;i++){
                if(i != num-1 && values[i] == values[i+1]){ // i != 4
                    counter++;
                }
            }
            System.out.println(counter);
        }
}
