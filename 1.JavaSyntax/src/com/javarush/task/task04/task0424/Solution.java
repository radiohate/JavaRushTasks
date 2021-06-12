package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int twice = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]) twice = arr[i];
            }

        }
        //System.out.println(twice);
        for (int i = 0; i < arr.length; i++) {
            if(twice == 0){}
            else if(arr[i] != twice) System.out.println(i+1);
        }
    }
}
