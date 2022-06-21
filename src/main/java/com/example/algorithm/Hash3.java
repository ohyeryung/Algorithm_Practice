package com.example.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Hash3 {
    public static void main(String[] args) {
        String[][] phone_book = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Hash3 solution = new Hash3();
        System.out.println(solution.Solution(phone_book));
}

    public int Solution(String[][] clothes) {
        int answer = 1;
        // 빈 HashMap 선언
        HashMap<String, Integer> hs = new HashMap<>();

        // HashMap 안에 key value 형태로 data 넣어주기
        // headgear를 아예 안 쓰는 경우, 첫 번째 headgear 쓰는 경우, 두 번째 headgear 쓰는 경우 (3가지) * eyewear를 아예 안 쓰는 경우, 쓰는 경우 (2가지) = 6 가지 (아무 것도 착용하지 않는 경우 한 가지를 제외) => 답!
        for (int i = 0; i < clothes.length; i++) {
            System.out.println(clothes[i][1]);
            String ca = clothes[i][1];
            hs.put(ca, hs.getOrDefault(clothes[i][1],0) + 1);
            System.out.println(hs);
        }
        for (Map.Entry<String,Integer> entry : hs.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        return answer - 1;
    }
}
