package com.example.algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr = br.readLine();
        char[] charArr = arr.toCharArray(); // [9, 9, 9, 9]

        System.out.println("charArr = " + Arrays.toString(charArr));

        int[] setList = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < charArr.length; i++) {
            int a = charArr[i]-'0';
            if (a == 6 || a == 9) {
                setList[6]++;
            } else {
                setList[a]+=2;
            }
        }
        System.out.println(Arrays.toString(setList));
        int max = 0;
        for (int i = 0; i < setList.length; i++) {
            max = Math.max(setList[i], max);
        }
        System.out.println("max = " + Math.round((double) max/2));

    }
}
