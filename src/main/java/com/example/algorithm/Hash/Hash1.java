package com.example.algorithm.Hash;

import java.util.HashMap;

public class Hash1 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        Hash1 solution = new Hash1();
        System.out.println(solution.Solution(participant,completion));
    }
    public String Solution(String[] participant, String[] completion) {
        HashMap<String ,Integer> h = new HashMap<String ,Integer>();
        int tmp=0;
        for(String s: completion) {
            // System.out.println(h.get(s));
            if(h.get(s) != null) {
                tmp = h.get(s);
                h.put(s,tmp+1);
            }
            else {
                h.put(s,1);
            }
        }
        // System.out.println(h.toString());

        for(String s:participant) {
            if(h.get(s) != null) {
                tmp = h.get(s);
                if(tmp>0)
                    h.put(s,tmp-1);
                else {
                    return s;
                }
            }
            else {
                return s;
            }
        }
        return "Error";

    }
}
