package com.example.algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int[] intarr = new int[10];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < intarr.length; j++) {
                int num = Integer.parseInt(st.nextToken());
                intarr[j] = num;
//                if (intarr[j] > intarr[j+1]) {
//                    int temp = intarr[j];
//                    intarr[j] = intarr[j+1];
//                    intarr[j+1] = temp;
//                }
            }
            Arrays.sort(intarr);
            sb.append(intarr[7]).append("\n");
        }
        System.out.println(sb);
    }
}
