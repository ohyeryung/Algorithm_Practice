package com.example.algorithm.Binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 예산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int left = 0, right = -1;

        int[] intarr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            intarr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, intarr[i]);
        }

        int M = Integer.parseInt(br.readLine());

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("mid = " + mid);
            long budget = 0;
            for (int i = 0; i < N; i++) {
                if (intarr[i] > mid) budget += mid;
                else budget += intarr[i];
            }
            System.out.println("budget = " + budget);
            if (budget <= M) {
                left = mid + 1;
                System.out.println("left = " + left);
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }

}
