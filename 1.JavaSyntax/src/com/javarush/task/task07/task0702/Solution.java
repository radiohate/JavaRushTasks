package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sArr[] = new String[10];
        for (int i = 0; i < sArr.length-2; i++) {
            sArr[i] = br.readLine();
        }
        printReverse(sArr);
    }
    public static void printReverse(String[] sArr){
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[sArr.length - i -1]);
        }
    }
}