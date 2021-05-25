package com.java;

import java.util.Scanner;

public class LuckyTicket {

    public static void main(String[]argus) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String value = scanner.next();
        int domain = size / 2;
        boolean res = true;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<size;i++){
            char myChar = value.charAt(i);
            if(myChar != '4' && myChar != '7'){
                res = false;
                break;
            }
            int newMyChar =Integer.parseInt(myChar + "");
            if(i<domain){
                sum1 += newMyChar;
            } else {
                sum2 += newMyChar;
            }
        }
        if(res&& sum1 == sum2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
