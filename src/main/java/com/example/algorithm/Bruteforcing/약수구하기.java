package com.example.algorithm.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int result = 0;

        for (int i = 1; i < N + 1; i++) {
            if (N % i == 0) {
                cnt++; // 약수의 개수 구하기
            }
            if (cnt == K) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
