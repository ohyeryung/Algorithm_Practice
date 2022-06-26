package com.example.algorithm.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println("n = " + n); // 4

        final int start = 301;
        final int end = 1201;
        int[][] days = new int[n][2];

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            String[] b = a.split(" ");

            int startMonth = Integer.parseInt(b[0]);
            int startDay = Integer.parseInt(b[1]);
            int endMonth = Integer.parseInt(b[2]);
            int endDay = Integer.parseInt(b[3]);
            days[i][0] = 100*startMonth + startDay;
            days[i][1] = 100*endMonth + endDay;
        }

        int max = 0, answer = 0, temp = start;
        // max : 직전 꽃이 지는 날보다 먼저 피는 것 중 가장 늦게 지는 꽃의 지는 날짜
        // (ex. 3  1 4 27
        //      3 11 5 28
        //      4 25 5 15
        //      4 30 6 20
        // 4월 27일보다 먼저 피는 3월 11일, 4월 25일. 4월 30일 중에 가장 늦게 지는 꽃의 지는 날짜 : 6월 20일 (max에 해당) )

        // temp : 직전 꽃이 지는 날짜

        while (max < end) {
            for (int i=0; i < n; i++) {
                if (temp >= days[i][0]) { // 직전 꽃이 지는 날보다 빨리 피는 꽃 중
                    if (max < days[i][1]) {
                        max = days[i][1]; // max에 가장 늦게 지는 날짜 대입
                        days[i][0] = 9999;
                    }
                }
            }
            if (temp == max) {
                answer = 0;
                break;
            }
            temp = max; // 가장 늦게 지는 날짜가 직전 꽃이 지는 날짜가 됨
            answer++;
        }
        System.out.println(answer);
    }
}
