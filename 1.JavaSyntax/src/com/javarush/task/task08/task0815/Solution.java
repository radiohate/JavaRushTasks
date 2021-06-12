package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("122", "34");
        map.put("12", "34");
        map.put("11", "11");
        map.put("22", "22");
        map.put("33", "33");
        map.put("44", "44");
        map.put("55", "55");
        map.put("66", "66");
        map.put("77", "77");
        map.put("88", "88");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
       int countName = 0;
        for (String s: map.values()) {
            if(s.equals(name))
                countName++;
        }
        return countName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;
        for (Map.Entry pair: map.entrySet()) {
            String key = (String) pair.getKey();
            if(key.equals(lastName))
                countLastName++;
        }
        return countLastName;

    }

    public static void main(String[] args) {

    }
}
