package com.java;
import java.util.Scanner;

public class PrimeFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt(); //it is the number to be checked
        int flag1 = 0;
        for (int z=0;z<num;z++){
            int value = scanner.nextInt();
            for(int i=2;i*i<=value;i++){
                if(num%i==0){
                    System.out.println("NO");
                    flag1=1;
                    break;
                }
            }
            if(flag1==0) {
                System.out.println("YES");
            }
            flag1 = 0;
        }
    }
}
