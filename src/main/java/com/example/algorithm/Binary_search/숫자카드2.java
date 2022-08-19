package com.example.algorithm.Binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] intarr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            intarr[i] = n;
        }
        Arrays.sort(intarr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            // upperBound와 lowerBound의 차이 값을 구한다.
            sb.append(upperBound(intarr, target) - lowerBound(intarr, target)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] intarr, int target) {
        int lo = 0;
        int hi = intarr.length;

        // lo가 hi랑 같아질 때까지 반복
        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간 위치 구하기

            /*
             * target 값이 중간 위치의 값보다 작거나 같을 경우
             *
             * (중복 원소에 대해 왼쪽으로 탐색하도록 한다)
             */
            if (target <= intarr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;

    }

    private static int upperBound(int[] intarr, int target) {
        int lo = 0;
        int hi = intarr.length;

        // lo 가 hi랑 같아질 때까지 반복
        while(lo < hi) {

            int mid = (lo + hi) / 2; // 중간 위치 구하기

            // target 값이 중간 위치의 값보다 작을 경우
            if (target < intarr[mid]) {
                hi = mid;
            }
            // 중복원소의 경우 else에서 처리
            else {
                lo = mid +1;
            }
        }
        return lo;
    }
}