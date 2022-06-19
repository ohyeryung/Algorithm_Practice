package com.example.algorithm;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Sort1 solution = new Sort1();
        System.out.println(Arrays.toString(solution.Solution(array, commands)));
    }

    public int[] Solution(int[] array, int[][] commands) {
        // commands의 길이만큼 배열 길이 선언
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){

            // copyOfRage() method : 특정부분 복사
            int[] arrList = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);

            // 오름차순 정렬
            Arrays.sort(arrList);

            answer[i] = arrList[commands[i][2]-1];
        }
        return answer;
    }
}
