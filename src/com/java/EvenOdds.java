package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long range = scanner.nextLong();
        Long search = scanner.nextLong();
        List<Integer> nums = new ArrayList();
        boolean flag = true;
        if(range % 2 == 0){

        } else {
            System.out.println();
        }
        System.out.println(nums.get((int) (search - 1)));
    }
}
