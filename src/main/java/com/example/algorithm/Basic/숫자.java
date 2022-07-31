package com.example.algorithm.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (A == B) {
            sb.append(0).append("\n");
            System.out.println(sb);
            return;
        } else if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }
        sb.append(B - A - 1).append("\n");

        for (long i = A + 1; i < B; i++) {

            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
