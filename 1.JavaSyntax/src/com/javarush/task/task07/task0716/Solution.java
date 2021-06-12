package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings.add("мера");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> fixStrings = new ArrayList<String>();
        for (String s: strings) {
            if (s.contains("л") && !s.contains("р")) {
                fixStrings.add(s);
                fixStrings.add(s);
            }
            else if(!s.contains("р") || (s.contains("р") && s.contains("л")))fixStrings.add(s);
        }

        return fixStrings;
    }
}