package com.example.algorithm.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            if (first == second && first == third) {
                System.out.println(first*1000+10000);
                break;
            } else if (first == second || first == third) {
                System.out.println(first*100 + 1000);
                break;
            } else if (second == third) {
                System.out.println(second*100 + 1000);
                break;
            } else {
                System.out.println(Math.max(first, Math.max(second, third))*100);
                break;
            }
        }
    }
}
