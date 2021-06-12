package com.javarush.task.task11.task1101;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] array = new int [20];

        for(int i = 0;i< array.length; i++)  {

            array [i] = Integer.parseInt(reader.readLine());
        }

        //int [] number = new int [10];

        //int [] number1 = new int [10];

        int [] number = Arrays.copyOf(array,10);

        int [] number1 = Arrays.copyOfRange(array,10,20);
              //copyofRange(number1,10);

        for(int i = 0;i< number1.length; i++)  {

            System.out.println(number1[i]);
        }


    }
}