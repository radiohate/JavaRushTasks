package com.javarush.task.task13.task1326;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
         //       /home/radiokate/Desktop/1.txt
        FileInputStream is = new FileInputStream(name);
        BufferedReader brIs = new BufferedReader(new InputStreamReader(is));
        ArrayList<Integer> arr = new ArrayList<>();
        String s;
        while ((s = brIs.readLine()) != null)
        {
            try {

                arr.add(Integer.parseInt(s));
            }
            catch (NumberFormatException e){
                //System.out.println(e);
            }
        }
        Collections.sort(arr);
        for(Integer a: arr) {
            if(a%2 == 0) System.out.println(a);
        }
        br.close();
        brIs.close();

    }
}
