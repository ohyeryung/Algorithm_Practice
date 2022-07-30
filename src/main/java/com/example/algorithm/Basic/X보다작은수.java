package com.example.algorithm.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        System.out.println("n = " + n);
        int x = Integer.parseInt(st.nextToken());
        System.out.println("x = " + x);

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println("num = " + num);
            if (num < x) {
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);
    }
}
