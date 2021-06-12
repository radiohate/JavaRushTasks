package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(name);
        int min = 10000000;
        int a;
        while (fis.available() > 0){
            a = fis.read();
            if(a < min) min = a;
        }
        fis.close();
        System.out.println(min);
    }
}
