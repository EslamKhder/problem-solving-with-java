package com.java;

import java.util.Scanner;

public class Present {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0, b = 0, c= 0;
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
        if(a >= b && a >= c)
        {
            if(b >= c)
            System.out.println("1 2 3");
            else
            System.out.println("1 3 2");
        }
        else if(b >= a && b >= c)
        {
            if(a >= c)
                System.out.println("2 1 3");
            else
            System.out.println("3 1 2");
        }
        else if(c >= a && c >= b)
        {
            if(a >= b)
                System.out.println("2 3 1");
            else
            System.out.println("3 2 1");
        }
    }

    /*public static int[] sorting(int []intArray){
        int temp = 0;
        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] >intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }*/
}
