package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        printCountPositive(arr);

    }
    public static void printCountPositive (int arr[]){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) counter++;
        }
        System.out.println(counter);
    }
}
