package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Character.toUpperCase;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        /*String result = "";
        String[] arrStr = string.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            result += toUpperFirst(deleteNFirstSpaces(arrStr[i])) + " ";
            //System.out.print(toUpperFirst(arrStr[i]) + " ");
        }
        System.out.println(result);*/
        //напишите тут ваш код
        //String s = "  oii  oi  o";
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }
        if(arr.get(0) != ' ') arr.set(0, toUpperCase(arr.get(0)));
        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i) == ' ' && arr.get(i+1) != ' ') arr.set((i+1), toUpperCase(arr.get(i+1)));
        }
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
    public static String toUpperFirst(String s){
        String newS = s.substring(0,1).toUpperCase()+ s.substring(1);
        return newS;
    }
    public static String deleteNFirstSpaces (String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i, i+1).equals(" ")) s = s.substring(i+1);
            else break;
        }
        return s;
    }
}
