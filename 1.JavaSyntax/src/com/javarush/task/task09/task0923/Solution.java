package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //String sInput = "Мама мыла раму.";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sInput = br.readLine();
        char[] charArray = sInput.toCharArray();
        //ArrayList<String> arrVowel = new ArrayList<>();
        //ArrayList<String> arrNotVowel = new ArrayList<>();
        String vowels = "";
        String notVowels = "";
        for (int i = 0; i < charArray.length; i++) {
            if(isVowel(charArray[i])) vowels += charArray[i] + " ";
            else if (charArray[i] != ' ') notVowels += charArray[i] + " ";
        }
        System.out.println(vowels);
        System.out.println(notVowels);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}