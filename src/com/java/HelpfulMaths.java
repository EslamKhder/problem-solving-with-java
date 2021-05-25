package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        List nums = new ArrayList<>(); //321
        for (int i =0;i<value.length();i+=2){
            nums.add(value.charAt(i));
        }
        Collections.sort(nums); // 123
        System.out.print(nums.get(0)); // 1
        for (int i=1;i<nums.size();i++){
            System.out.print("+" + nums.get(i));
        }
    }
}
