package com.example.algorithm.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String method = st.nextToken();

            if (method.equals("push")) {
                if (st.hasMoreTokens()) {
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                }
            } else if (method.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if (method.equals("size")) {
                System.out.println(stack.size());
            } else if (method.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (method.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }

//            switch (method) {
//                case "push":
//                    if (st.hasMoreTokens()) {
//                        int num = Integer.parseInt(st.nextToken());
//                        stack.push(num);
//                    }
//                    break;
//                case "top":
//                    if (stack.isEmpty()) {
//                        System.out.println(-1);
//                    } else {
//                        System.out.println(stack.peek());
//                    }
//                    break;
//                case "size":
//                    System.out.println(stack.size());
//                    break;
//                case "empty":
//                    if (stack.isEmpty()) {
//                        System.out.println(1);
//                    } else {
//                        System.out.println(0);
//                    }
//                    break;
//                case "pop":
//                    if (stack.isEmpty()) {
//                        System.out.println(-1);
//                    } else {
//                        System.out.println(stack.pop());
//                    }
//                    break;
//            }
        }
    }
}