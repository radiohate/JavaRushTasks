package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String m = br.readLine();
        String m1 = m.toUpperCase();

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(formatter.parse(m1));
        System.out.println(m + " is the " +(calendar.get(2) + 1)+ " month");


    }
}
