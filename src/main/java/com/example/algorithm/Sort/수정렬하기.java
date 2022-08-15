package com.example.algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] answer = new int[N];

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            answer[i] = num;
        }
        Arrays.sort(answer);
        for (int i = 0; i <N; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }
}
