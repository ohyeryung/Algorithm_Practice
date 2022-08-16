package com.example.algorithm.Binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            System.out.println("N = " + N);
            int[] A = new int[N];

            int M = Integer.parseInt(st.nextToken());
            System.out.println("M = " + M);
            int[] B = new int[M];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                A[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                B[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println("A : " + Arrays.toString(A));
            System.out.println("B : " + Arrays.toString(B));
        }
    }
}
