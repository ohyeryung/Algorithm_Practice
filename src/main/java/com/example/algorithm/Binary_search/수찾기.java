package com.example.algorithm.Binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {

    public static int[] intarr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        intarr = new int[N];

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
            if (binarySearch(target) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int lo = 0; // 탐색 범위의 왼쪽 끝 인덱스
        int hi = intarr.length - 1; // 탐색 범위의 오른쪽 끝 인덱스

        while(lo <= hi) {
            int mid = (lo + hi) / 2; // 중간 위치 구하기

            // key 값이 중간 위치의 값보다 작은 경우
            if (key < intarr[mid]) {
                hi = mid - 1;
            }
            // key 값이 중간 위치의 값보다 클 경우
            else if (key > intarr[mid]) {
                lo = mid + 1;
            }
            // key 값과 중간 위치의 값이 같을 경우
            else {
                return mid;
            }
        }
        // 찾고자 하는 값이 존재하지 않는 경우
        return -1;
    }
}