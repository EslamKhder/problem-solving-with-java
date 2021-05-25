package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teaWordsNum = scanner.nextInt();
        int wordsNum = scanner.nextInt();
        Map<String,String> mywords = new HashMap<>();
        for (int i =0;i<wordsNum;i++){
            String val1 = scanner.next();
            String val2 = scanner.next();
            if(val1.length() <= val2.length()){
                mywords.put(val1,val1);
                mywords.put(val2,val1);
            } else {
                mywords.put(val2,val2);
                mywords.put(val1,val2);
            }
        }
        for (int i=0;i<teaWordsNum;i++) {
            String word = scanner.next();
            System.out.print(mywords.get(word) + " ");
        }

    }
}
