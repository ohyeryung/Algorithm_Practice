package com.example.algorithm.Binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        double Z = (double) Y/X*100;

        int answer = 0;
        if ((double)Y/X*100 > Z) {
            answer++;
        } else if ((double)Y/X*100 == Z) {
            System.out.println(-1);
        }
        System.out.println(answer);
    }
}
