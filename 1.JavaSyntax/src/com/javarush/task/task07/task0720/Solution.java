package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код

        ArrayList<String> list  = new ArrayList<>();
        //Collections.addAll(list, "1", "2", "3", "4", "5");
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        String sbuf = "";
        for (int i = 0; i < M; i++) {
            sbuf = list.get(0);
            list.remove(0);
            list.add(sbuf);
        }

        for (String s: list) System.out.println(s);

    }
}
