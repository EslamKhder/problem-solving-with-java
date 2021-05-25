package com.java;

import java.util.Scanner;

public class PanScales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scale = scanner.next();
        String value = scanner.next();
        String pointerLeft = "";
        String pointerRight = "";
        Boolean flag = true;
        for (int i = 0; i < scale.toCharArray().length; i++) { // W b n | T
            if (flag) {
                if (scale.toCharArray()[i] == '|') {
                    flag = false;
                    continue;
                }
                pointerLeft += scale.toCharArray()[i];
            } else {
                pointerRight += scale.toCharArray()[i];
            }
        }
        if((pointerLeft.length() + pointerRight.length() + value.length()) % 2 == 0
           && !(pointerLeft.length() > (pointerRight.length() + value.length()))
           && !(pointerRight.length() > (pointerLeft.length() + value.length()))){
            for (int x =0;x<value.length();x++){
                if(pointerLeft.length() > pointerRight.length()){
                    pointerRight += value.toCharArray()[x];
                } else {
                    pointerLeft += value.toCharArray()[x];
                }
            }
            System.out.println(pointerLeft+ '|' +pointerRight);
        } else {
            System.out.println("Impossible");
        }
    }
}