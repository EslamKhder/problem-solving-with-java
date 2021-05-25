package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestoringPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 01001100100101100000010110001001011001000101100110010110100001011010100101101100
        String value = scanner.next();
        Map<String,Integer> maps = new HashMap<>();
        for (int i =0;i<10;i++){
            maps.put(scanner.next(),i);
        }
        for (int i =0;i<80;i+=10){
            String val = value.substring(i,i+10);
            System.out.print(maps.get(val));
        }
    }
}
/*



* */