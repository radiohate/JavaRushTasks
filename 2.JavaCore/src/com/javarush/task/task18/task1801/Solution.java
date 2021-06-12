package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        FileInputStream is = new FileInputStream(fileName);
        int max = 0;
        int a;
        while (is.available() > 0){
            a = is.read();
            if(a > max) max = a;
        }
        is.close();
        System.out.println(max);
    }
}
