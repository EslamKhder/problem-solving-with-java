package com.java;

import java.util.Scanner;

public class GoodBad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        int result = 0;
        for (int i=0;i<nums;i++){
            result = 0;
            String num = scanner.next();
            for (int z=0;z<num.toCharArray().length;z++) {
                if(z != num.toCharArray().length - 1 && num.toCharArray()[z] == num.toCharArray()[z+1]){
                    result = 1;
                    break;
                }
            }
            if(result == 1){
                System.out.println("Bad");
            } else {
                System.out.println("Good");
            }
        }
    }
}
