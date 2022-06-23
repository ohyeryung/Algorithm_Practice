package com.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Greedy2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println("N = " + N);


        int[][] time = new int[N][2];

        StringTokenizer st;

        /*
        time[][0]은 시작시점을 의미
        time[][1]은 종료시점을 의미
        */

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            time[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                // 종료 시간이 같은 경우 시작 시간이 빠른 순으로 정렬해야 함!
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;

        int prev_end_time = 0;

        for (int i = 0; i < N; i++) {
            if (prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count ++;
            }
        }
        System.out.println(count);
    }
}
