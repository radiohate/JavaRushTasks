package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> arr = new ArrayList<>();
        //Collections.addAll(arr, 1, 1, 1, 4, 4, 4, 4, 4, 4, 4);
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> arrInARow = new ArrayList<>();
        int maxInARow = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i).equals(arr.get(i+1))){
                maxInARow++;
                //System.out.println(i + "step, max = " + maxInARow + ", value is " + arr.get(i));
            }
            else {
                arrInARow.add(maxInARow+1);
                maxInARow = 0;
            }
        }
        arrInARow.add(maxInARow+1);
        //for(Integer i: arrInARow) System.out.println(i);
        Collections.sort(arrInARow);
        System.out.println(arrInARow.get(arrInARow.size()-1));

    }
}