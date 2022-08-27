package com.example.algorithm.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        StringBuffer sb = new StringBuffer();

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
//                    System.out.println(queue.peek());
//                }
//            } else if (method.equals("back")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(last);
//                }
//            }

            switch (method) {
                case "push":
                    if (st.hasMoreTokens()) {
                        int num = Integer.parseInt(st.nextToken());
                        System.out.println(num);
                        last = num;
                        queue.offer(num);
                    }
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(last).append("\n");
                    }
            }
        }
        System.out.println(sb);
    }
}

