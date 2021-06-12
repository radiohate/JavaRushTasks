package com.javarush.task.task04.task0429;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        printCountTypeOfNum(arr);

    }
    public static void printCountTypeOfNum (int[] arr){
        int counterNeg = 0;
        int counterPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) counterPos++;
            else if (arr[i]<0) counterNeg++;
        }
        System.out.println("количество отрицательных чисел: " + counterNeg);
        System.out.println("количество положительных чисел: " + counterPos);
    }
}
