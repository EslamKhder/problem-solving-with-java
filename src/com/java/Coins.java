package com.java;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        char []nums;
        for (int i = 0; i<3;i++){
            String value = scanner.next(); // A < B
            nums = value.toCharArray();
            if(nums[1] == '>'){
                if(nums[0] == 'A'){
                    a++;
                } else if(nums[0] == 'B'){
                    b++;
                } else {
                    c++;
                }
            } else {
                if(nums[2] == 'A'){
                    a++;
                } else if(nums[2] == 'B'){
                    b++;
                } else {
                    c++;
                }
            }
        }
        if(a == b || a == c || b == c){
            System.out.println("Impossible");
        } else {
            if(a >b && a>c){ /// a 2
                if(b > c){ // b 1
                    System.out.println("CBA");
                } else { // c 0
                    System.out.println("BCA");
                }
            } else if(b >a && b>c){
                if(a > c){
                    System.out.println("CAB");
                } else {
                    System.out.println("ACB");
                }
            } else {
                if(a > b){
                    System.out.println("BAC");
                } else {
                    System.out.println("ABC");
                }
            }
        }
    }
}
