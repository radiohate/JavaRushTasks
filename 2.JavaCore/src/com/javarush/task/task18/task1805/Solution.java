package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();

        FileInputStream is = new FileInputStream(name);
        HashSet<Integer> arrUniq = new HashSet<>();

        while (is.available() > 0){
            arrUniq.add(is.read());
        }
        is.close();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(arrUniq);

        Collections.sort(arr);
        for(int i: arr) System.out.print(i + " ");

    }
}
