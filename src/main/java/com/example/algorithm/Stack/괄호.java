package com.example.algorithm.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();

        StringTokenizer st;

        for (int i = 0; i < T; i++) {

            stack.clear();

            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            for (int j = 0; j < a.length(); j++) {
                Character ch = a.charAt(j);
                if (ch.equals('(')) {
                    stack.push(ch);
                } else if (stack.isEmpty()) {
                    stack.push(ch);
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

