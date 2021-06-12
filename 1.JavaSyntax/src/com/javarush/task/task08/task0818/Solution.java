package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i+1), (i+1)*100);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> doubleMap = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair: doubleMap.entrySet()){
            if(pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> map = createMap();
        removeItemFromMap(map);
        //for(Map.Entry<String, Integer> pair: map.entrySet()) System.out.println(pair.getKey() + " " + pair.getValue());

    }
}