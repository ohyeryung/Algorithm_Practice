package com.example.algorithm.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 핸드폰요금 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int YR = 0;
        int MR = 0;
        int Ysum = 0;
        int Msum = 0;

        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(st.nextToken());

            YR = t%30;
            int a = t/30;

            if (YR >= 0) {
                a++;
            }

            Ysum += a*10;

            MR = t%60;
            int b = t/60;

            if (MR >= 0) {
                b++;
            }
            Msum += b*15;
        }
        if (Ysum > Msum) {
            System.out.println("M " + Msum);
        } else if (Ysum < Msum) {
            System.out.println("Y " + Ysum);
        } else {
            System.out.println("Y M " + Ysum);
        }
    }
}
