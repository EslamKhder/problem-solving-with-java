package com.java;


import java.util.Scanner;
import java.util.Stack;

public class GreatVovaWall2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); // [,]
        int numOfWall = scanner.nextInt();
        int max = 0;
        boolean res = false;
        for (int i=0;i<numOfWall;i++){
            int hWall = scanner.nextInt(); // 10
            if(max < hWall){
                max = hWall;
            }
            int temp = 0;
            if((!stack.empty())){
                temp = stack.peek(); // 2
            }
            if((!stack.empty()) && (hWall == temp)){
                stack.pop();
                if((!stack.empty()) && stack.peek() < temp){
                    res = true;
                    break;
                }
            } else {
                stack.push(hWall);
            }
        }
        if(stack.size() > 1 || res || ((!stack.empty()) && stack.peek() < max)){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}