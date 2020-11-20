package com.company;

import java.util.*;

public class NextTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSolved = scanner.nextInt();
        int []nums = new int[numSolved];
        int result = 0;
        int start = 1;
        for (int i =0;i<numSolved;i++){
            nums[i] = scanner.nextInt();
        }
        sortArray(nums);
        for (int i =0;i<numSolved;i++){
                if(!(nums[i] == start)){
                    result = nums[i];
                    break;
                }
            start++;
        }
        System.out.println(start);
    }
    public static void sortArray(int []intArray){
        int temp = 0;
        //Sort the array in ascending order using two for loops
        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] >intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
