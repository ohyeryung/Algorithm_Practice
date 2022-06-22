package com.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine()); // {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000}
        }
        int count = 0;

        // K원을 큰 수(N번째 금액)부터 나누기
        for (int i = N-1; i >=0; i--) {

            // 현재 동전의 금액이 K(정해준 금액)보다 작거나 같아야 나눌 수 있음
            if (coin[i] <= K) {
                // 현재 동전의 금액으로 만들 수 있는 개수를 더해줌
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
