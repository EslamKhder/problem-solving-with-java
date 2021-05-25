package com.java;

import java.util.Scanner;
import java.util.Stack;

public class GreatVovaWall1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack(); // 5
        int numOfWall = scanner.nextInt(); // 5
        for (int i=0;i<numOfWall;i++){
            int wall = scanner.nextInt(); // 5
            if( !stack.empty() && ((wall+stack.peek()) %2 == 0)){
                stack.pop();
            } else {
                stack.push(wall);
            }
        }
        if(stack.size() > 1){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
