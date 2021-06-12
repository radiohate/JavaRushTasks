package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(arr.size()-i-1));
        }
    }
}
