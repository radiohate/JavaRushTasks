package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<>();
         try{
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             while (true) arr.add(Integer.parseInt(br.readLine()));

         } catch (NumberFormatException e){
             for(Integer i: arr) System.out.println(i);
         }
         catch (Exception e){

         }
    }
}
