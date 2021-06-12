package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","1");
        map.put("3","1");
        map.put("4","2");
        map.put("5","3");
        map.put("6","4");
        map.put("7","8");
        map.put("8","9");
        map.put("9","0");
        map.put("9","1");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
