package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = new String[10];
        int[] iArr = new int[10];
        for (int i = 0; i < sArr.length; i++) {
            String s = br.readLine();
            sArr[i] = s;
            iArr[i] = sArr[i].length();
        }
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
    }
}
