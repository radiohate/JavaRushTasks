package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        String sIn = "";
        for (String s: list){
            sIn += s.toLowerCase();
        }
        char[] chArr = sIn.toCharArray();
        //Map<String, Integer> map = new Map
        int[] arr = new int[33];
        for (int i = 0; i < alphabet.size(); i++) {

            for (int j = 0; j < chArr.length; j++) {
                if(chArr[j] == alphabet.get(i)) arr[i]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(alphabet.get(i) + " " + arr[i]);
        }

        // напишите тут ваш код
    }
}
