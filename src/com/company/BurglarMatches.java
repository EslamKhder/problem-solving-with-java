package com.company;

import java.util.*;

public class BurglarMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBags = scanner.nextInt();
        int numBox = scanner.nextInt();
        Map<Integer,Integer> boxs = new HashMap<>();

        for (int i =0;i<numBox;i++){
            int nums = scanner.nextInt();
            int total = scanner.nextInt();
            if(boxs.containsKey(total)){
                boxs.put(total,boxs.get(total) + nums);
            } else {
                boxs.put(total,nums);
            }
        }
        List<Integer> keysMap = new ArrayList<>(boxs.keySet());
        int result = 0;
        for (int i =boxs.size() -1;i>=0;i--){
            if(boxs.get(keysMap.get(i)) < numBags){
                result += (keysMap.get(i) * boxs.get(keysMap.get(i)));
            } else {
                result += (keysMap.get(i)* numBags);
                break;
            }
            numBags -= boxs.get(keysMap.get(i));

        }
        System.out.println(result);
    }
}