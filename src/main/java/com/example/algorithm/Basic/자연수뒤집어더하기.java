package com.example.algorithm.Basic;

import java.util.Arrays;

public class 자연수뒤집어더하기 {

    public StringBuilder solution(int n) {
        String str = Integer.toString(n);
        char[] num = str.toCharArray();
        System.out.println("num = " + Arrays.toString(num));

        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 0; i <str.length(); i++) {
            num[i] = str.charAt(i);
            sum += num[i]-'0';
        }
        for (int i = num.length-1; i >= 0; i--) {
            if (i == 0) {
                sb.append(num[i]).append("=").append(sum);
            } else {
                sb.append(num[i]).append("+");
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        자연수뒤집어더하기 method = new 자연수뒤집어더하기();
        System.out.println(method.solution(718253));
    }

}
