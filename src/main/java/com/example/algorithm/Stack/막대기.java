package com.example.algorithm.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

//        int[] arr = new int[N];

//        int cnt = 1;

        int h = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            stack.push(h);
//            arr[i] = h;
        }
//            int max = arr[N-1];
//            System.out.println("max = " + max);
//
//            for (int i = 0; i < N; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                cnt++;
//            }
//        }
//        System.out.println(Arrays.toString(new int[]{arr[N-1]}));
//        System.out.println(cnt);

        int max = stack.pop();
        int cnt = 1;
        int current = 0;
        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current > max) {
                max = current;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
