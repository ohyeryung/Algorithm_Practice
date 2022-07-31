package com.example.algorithm.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] intarr = new int[9];

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            intarr[i] = Integer.parseInt(br.readLine());
            sum += intarr[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(intarr));

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - intarr[i] - intarr[j] == 100) {
                    intarr[i] = 0;
                    intarr[j] = 0;
                    Arrays.sort(intarr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(intarr[k]);
                    }
                    return;
                }
            }
        }
    }
}
