package com.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Football {
    public static void main(String[] args) {
        /*String s = "sdfsd";
        System.out.println(s.substring(0,1));*/
        Scanner scanner = new Scanner(System.in);
        int numberTeams = scanner.nextInt();
        Map<String,Integer> teams = new HashMap<>();
        for (int i =0;i<numberTeams;i++){
            String team = scanner.next();
            for (int x = 0;x < team.length();x++) {
                if (!teams.containsKey(team.substring(x,x+1))){
                    teams.put(team.substring(x,x+1),1);
                } else {
                    teams.put(team.substring(x,x+1),teams.get(team.substring(x,x+1)) + 1);
                }
            }
        }
        List<String> valuse = (List<String>) teams.keySet().stream().collect(Collectors.toList());
        List<Integer> vla = (List<Integer>) teams.values().stream().collect(Collectors.toList());
        System.out.print(valuse.get(0));
        for (int i =0;i<valuse.size()-1;i++){
            if(vla.get(i) <= vla.get(i+1) ){
                System.out.print(valuse.get(i+1));
            }
        }
    }
}
