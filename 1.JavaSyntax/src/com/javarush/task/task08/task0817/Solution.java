package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Ivan");
        map.put("Смирнова", "Anna");
        map.put("Иванов", "Ivan");
        map.put("Иванова", "Anna");
        map.put("Петров", "qwe");
        map.put("Петрова","qwert");
        map.put("Сидоров", "qwerty");
        map.put("Сидорова","asd");
        map.put("Васильев", "asdf");
        map.put("Васильева", "asdfg");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<>(map.values());
        Set<String> uniqNames = new HashSet<>(names);
        for(String s: uniqNames){
            names.remove(s);
            if (names.contains(s)){
                removeItemFromMapByValue(map,s);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        //for (Map.Entry<String, String> pair : map.entrySet()) System.out.println(pair.getKey() + " " + pair.getValue());

    }
}
