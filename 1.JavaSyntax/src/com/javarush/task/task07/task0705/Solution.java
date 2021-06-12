package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrBig = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrBig.length; i++) {
            arrBig[i] = Integer.parseInt(br.readLine());
        }

        int buf = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arrBig[i];
            //System.out.println(arr1[i]);
            buf++;
        }
        //System.out.println(buf);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arrBig[i + buf];
            System.out.println(arr2[i]);
        }

    }
}
