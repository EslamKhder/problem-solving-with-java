package com.java;

import java.util.Scanner;

public class RamadanEquation {

    public static void main(String[]argus) {
        Scanner scanner = new Scanner(System.in);
        String equ = scanner.nextLine();
        Scanner input = new Scanner(equ);
        boolean left = true;
        boolean equa = false;
        int arr[] = new int[2];
        int i =0;
        while (input.hasNext()){
            String myValue = input.next();
            if(myValue.equals("+")){
                continue;
            }else if(myValue.equals("=")){
                equa = true;
                //continue;
            } else if ((myValue.charAt(0) >=65 && myValue.charAt(0) <=122) && equa == true){
                left = false;
            } else if ((myValue.charAt(0) >=65 && myValue.charAt(0) <=122)){
                continue;
            } else {
                arr[i++] = Integer.parseInt(myValue);
            }
        }
        if(left){
            System.out.println(arr[1] - arr[0]);
        } else {
            System.out.println(arr[0] + arr[1]);
        }
    }
}
