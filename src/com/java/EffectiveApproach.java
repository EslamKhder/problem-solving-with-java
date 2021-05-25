package com.java;

import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArray = scanner.nextInt();  // number of element
        int []nums = new int[1000000];   // elements  // 3 1 2
        int number;
        long compare1 = 0;
        long compare2 = 0;
        for (int i=0;i<numArray;i++){
            number = scanner.nextInt();
            nums[number] = i+1; // nums[3] = 1 , nums[1] = 2  ,nums[2] = 3
        }
        /*
        * nums[3]   ----> 1
        * nums[1]   ----> 2
        * nums[3]   ----> 3
        * */
        int numSearch = scanner.nextInt();
        int numOfSearch;
        for(int i =0;i<numSearch;i++){
            numOfSearch = scanner.nextInt(); // 1
            compare1 += nums[numOfSearch]; // nums[1] = 2
            compare2 += (numArray - nums[numOfSearch]) + 1;  // 3 - 2 = 1 +1
        }
        System.out.println(compare1 + " " + compare2);
    }
}