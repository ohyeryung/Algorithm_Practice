package com.example.algorithm.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st;

        int last = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();

//            if (method.equals("push")) {
//                if (st.hasMoreTokens()) {
//                    int num = Integer.parseInt(st.nextToken());
//                    last = num;
//                    queue.offer(num);
//                }
//            } else if (method.equals("pop")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(queue.poll());
//                }
//            } else if (method.equals("size")) {
//                System.out.println(queue.size());
//            } else if (method.equals("empty")) {
//                if (queue.isEmpty()) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(0);
//                }
//            } else if (method.equals("front")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(queue.element());
//                }
//            } else if (method.equals("back")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(last);
//                }
//            }
//        }

            switch (method) {
                case "push" :
                if (st.hasMoreTokens()) {
                    int num = Integer.parseInt(st.nextToken());
                    last = num;
                    queue.offer(num);
                }
                break;
                case "pop" :
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
                break;
                case "size" :
                System.out.println(queue.size());
                break;
                case "empty" :
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                break;
                case "front" :
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.element());
                }
                break;
                case "back" :
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(last);
                }
            }
        }

    }
}
