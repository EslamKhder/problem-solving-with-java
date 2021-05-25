package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Character> myChar = new ArrayList<>();
        List<Character> password = new ArrayList<>();
        for (int i = 97;i<97+k;i++){
            myChar.add((char) i);
        }
        int pointer = 0;
        for (int i = 0;i<n;i++){
            password.add(myChar.get(pointer));
            if (pointer == myChar.size() - 1) {
                pointer = 0;
            } else {
                pointer++;
            }
            System.out.print(password.get(i));
        }
    }
}
