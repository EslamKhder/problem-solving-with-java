package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Register {
    public static void main(String[]argus) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<String,Integer> database = new HashMap<>();

        for (int i=0;i<size;i++){
            String email = scanner.next();
            if(!database.containsKey(email)){
                System.out.println("OK");
                database.put(email,0);
            } else {
                int res = database.get(email) + 1;
                System.out.println(email + res);
                database.put(email,res);
            }
        }

    }
}
