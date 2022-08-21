package com.example.algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상금헌터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st.nextToken());
            System.out.println("first = " + first);
            int second = Integer.parseInt(st.nextToken());
            System.out.println("second = " + second);

            int prize = 0;

            if (first == 1) {
                prize += 5000000;
            } else if (first == 2 || first == 3) {
                prize += 3000000;
            } else if (first > 3 && first <= 6) {
                prize += 2000000;
            } else if (first > 6 && first <= 10) {
                prize += 500000;
            } else if (first > 10 && first <= 15) {
                prize += 300000;
            } else if (first > 15 && first <= 21) {
                prize += 100000;
            }
            if (second == 1) {
                prize += 5120000;
            } else if (second == 2 || second == 3) {
                prize += 2560000;
            } else if (second > 3 && second <= 7) {
                prize += 1280000;
            } else if (second > 7 && second <= 15) {
                prize += 640000;
            } else if (second > 15 && second <= 31) {
                prize += 320000;
            }
            System.out.println(prize);
        }
    }
}
