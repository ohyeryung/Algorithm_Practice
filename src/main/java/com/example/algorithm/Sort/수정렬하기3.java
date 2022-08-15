package com.example.algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] intarr = new int[N];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            intarr[i] = num;
        }
        Arrays.sort(intarr);

        for (int i = 0; i < N; i++) {
            sb.append(intarr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
