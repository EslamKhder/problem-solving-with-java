package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DifferentIsGood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter=0;
        if(size >= 27){
            System.out.println(-1);
            return;
        }
        String value = scanner.next();// koko
        Map<Character,Integer> dif = new HashMap<>(); // [{k:2},{o,2}]
        for (int i =0;i<size;i++){
            char myChar = value.charAt(i); // o
            if(dif.containsKey(myChar)){
                dif.put(myChar,dif.get(myChar) + 1);
            } else {
                dif.put(myChar,1);
            }
        }
        for (Map.Entry<Character,Integer> en :dif.entrySet()){
            if(en.getValue() > 1){
                counter += en.getValue() -1;
            }
        }
        System.out.println(counter);
    }
}
