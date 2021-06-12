package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N > 0) {
            int maximum = Integer.parseInt(br.readLine());
            int n = 0;

            for (int i = 0; i < (N-1); i++) {
                n = Integer.parseInt(br.readLine());
                if(n > maximum) maximum = n;
            }

            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}
