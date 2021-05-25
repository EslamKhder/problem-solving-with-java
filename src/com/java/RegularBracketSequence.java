package com.java;

import java.util.Scanner;

public class RegularBracketSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char [] chars = scanner.next().toCharArray();
        int size = chars.length;
        int counter = 0;
        for(int i =0;i<chars.length;i++){
            if(chars[i] == '('){
                counter++; // 0
            } else {
                counter--;
                if(counter < 0){
                    size--;
                    counter = 0;
                }
            }
        }

        System.out.println(size - counter);

    }
}