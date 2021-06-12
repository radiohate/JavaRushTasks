package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = getInts();
        int maximum = arr[0];
        int minimum = arr[0];

        //напишите тут ваш код

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maximum) maximum = arr[i];
            if(arr[i] < minimum) minimum = arr[i];
        }


        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    static public int[] getInts() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(br.readLine());
        }
        return mas;
    }

}
