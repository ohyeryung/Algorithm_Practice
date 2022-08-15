package com.example.algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] intarr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int pivot = intarr[0];
            int left = pivot + 1;
            int right = intarr[N];
            intarr[i] = num;

            while(left <= right) {
                while (left <= right && intarr[left] <= intarr[pivot]) left++;
                while (right > pivot && intarr[right] >= intarr[pivot]) right--;
                if (left > right) {
                    int temp = intarr[pivot];
                    intarr[pivot] = intarr[right];
                    intarr[right] = temp;
                }
                else {
                    int temp = intarr[left];
                    intarr[left] = intarr[right];
                    intarr[right] = temp;
                }
            }
        }
    }
}
