package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums = s.nextInt();
        List<Character> one = new ArrayList<>();
        one.add('o');one.add('n');one.add('e');
        String value ;
        for (int i = 0; i < nums; i++) {
            value = s.next(); // owe
            int flag = 0;
            for (int z = 0; z < 3; z++) {
                char[] newvalue = value.toCharArray(); //owe
                newvalue[z] = one.get(z);//
                if(String.valueOf(newvalue).equals("one")){
                    System.out.println(1);
                    flag = 1;
                    break;
                }
            }
            if(value.length() > 3){
                System.out.println(3);
                flag = 1;
            }
            if (flag == 0){
                System.out.println(2);
            }
        }
    }
}
