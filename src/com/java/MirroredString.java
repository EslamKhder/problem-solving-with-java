package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MirroredString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 3
        List myChar = new ArrayList();
        myChar.add('A');myChar.add('H');myChar.add('I');myChar.add('M');
        myChar.add('O');myChar.add('T');myChar.add('U');myChar.add('V');
        myChar.add('W');myChar.add('X');myChar.add('Y');

        int flag= 0;
        while (size-- > 0){
            String value = scanner.next(); // aca
            StringBuffer stringBuffer = new StringBuffer(value);
            String newValue = stringBuffer.reverse().toString(); // aca

            if(value.equals(newValue)){ // jhd
                for(int z=0;z<value.length();z++){
                    if(myChar.contains(value.charAt(z))){
                        continue;
                    } else {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                flag = 0;
            } else {
                System.out.println("no");
            }
        }
    }
}
