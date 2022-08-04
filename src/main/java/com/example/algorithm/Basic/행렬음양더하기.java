package com.example.algorithm.Basic;

import java.util.Arrays;

public class 행렬음양더하기 {

    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] answer = new int[2][3];

        for (int i = 0; i < arr1.length; i++) {
            int[] first = arr1[i];
            int[] second = arr2[i];
            boolean[] sign = signs[i];
            for (int j = 0; j < first.length; j++) {
                int num1 = first[j];
                int num2 = second[j];
                int sum;
                if (sign[j]) {
                    sum = num1 + num2;
                } else {
                    sum = (num1 + num2) * (-1);
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        행렬음양더하기 method = new 행렬음양더하기();
        int[][] arr1 = {{5, 7, 1}, {2, 3, 5}};
        int[][] arr2 = {{5, 1, 6}, {7, 5, 6}};
        boolean[][] signs = {{true, true, false}, {false, true, false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}