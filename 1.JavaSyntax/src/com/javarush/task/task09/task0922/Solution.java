package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //String sInput = "2013-08-18";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String sInput = br.readLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(sInput);
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy");
            System.out.println(dateFormat2.format(date).toUpperCase());
        } catch (ParseException e) {

        }
        //AUG 18, 2013

    }
}
