package com.example.algorithm.Hash;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Hash2 solution = new Hash2();
        System.out.println(solution.Solution(phone_book));
    }

    // Hash 안쓰고 sort해서 푸는 방법
//    public boolean Solution(String[] phone_book) {
//        Arrays.sort(phone_book);
//
//        // startsWith 함수 : 접두어 판단하는 함수!
//        for (int i = 0; i < phone_book.length - 1; i++)
//            if (phone_book[i + 1].startsWith(phone_book[i]))
//                return false;
//        return true;
//    }

    // Hash
    public boolean Solution(String[] phone_book) {

        // 1. 빈 HashMap 선언
        Map<String, Integer> hs = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣기 (Key값만으로 비교가능하므로 value값은 관계 X!)
        for (int i = 0; i < phone_book.length; i++) {
            hs.put(phone_book[i],i);
        }

        for (int i = 0; i < phone_book.length; i++) {

            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hs.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }
        return true;
    }
}
