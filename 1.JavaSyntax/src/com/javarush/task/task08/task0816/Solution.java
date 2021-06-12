package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("JULY 1 2012"));
        map.put("Смирнова", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JULY 1 2012"));
        map.put("Иванова", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("JULY 1 2012"));
        map.put("Петрова", dateFormat.parse("MAY 1 2012"));
        map.put("Сидоров", dateFormat.parse("JULY 1 2012"));
        map.put("Сидорова", dateFormat.parse("MAY 1 2012"));
        map.put("Васильев", dateFormat.parse("JULY 1 2012"));
        map.put("Васильева", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Date> entry = entryIterator.next();
            int mm = entry.getValue().getMonth();
            if (mm > 4 && mm < 8) {
                entryIterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
       /* Map<String, Date> map = createMap();
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        for (Map.Entry<String, Date> pair: map.entrySet()) {
            System.out.println(pair.getValue().getMonth() + "" + pair.getKey() + " " + dateFormat.format(pair.getValue()));

        }
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + dateFormat.format(pair.getValue()));

        }*/

    }
}
