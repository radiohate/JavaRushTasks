package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
      //44
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();

        FileInputStream is = new FileInputStream(name);
        int count = 0;
        while (is.available() > 0){
            if(is.read() == 44) count++;
        }
        System.out.println(count);

        is.close();
    }
}
