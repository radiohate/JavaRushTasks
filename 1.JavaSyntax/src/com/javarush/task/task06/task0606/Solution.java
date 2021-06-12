package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = stringToIntArr(s);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
    public static int[] stringToIntArr(String s){
        int[] arr = new int[s.length()];
        String symb = "";
        for (int i = 0; i < s.length(); i++) {
            symb = s.substring(i,i+1);
            //System.out.println(symb);
            arr[i] = Integer.parseInt(symb);
        }
        return arr;
    }
}
