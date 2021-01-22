package com.company;

import java.util.*;

public class Heist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long size = input.nextLong();
        long counter = 1;
        List<Long> nums = new ArrayList<>();
        for (long i =0;i<size;i++) {
            nums.add(input.nextLong());
        }
        Collections.sort(nums);
        long val = nums.get(0);
        for (long i=val+1;i<val+size;i++){
            if(nums.contains(i)){
                counter++;
            }
        }

        System.out.println(size - counter);
    }
}
