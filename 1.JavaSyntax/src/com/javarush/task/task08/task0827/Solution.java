package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
JANUARY FEBRUARY MARCH APRIL MAY JUNE JULY AUGUST SEPTEMBER OCTOBER NOVEMBER DECEMBER
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        //String dateString = "MAY 1 2013";


       /* for (String s: dateString) System.out.println(s);
        int M;
        switch (dateString[0]){
            case "JANUARY": M = 0;break;
            case "FEBRUARY": M = 1;break;
            case "MARCH": M = 2;break;
            case "APRIL": M = 3;break;
            case "MAY": M = 4;break;
            case "JUNE": M = 5;break;
            case "JULY": M = 6;break;
            case "AUGUST": M = 7;break;
            case "SEPTEMBER": M = 8;break;
            case "OCTOBER": M = 9;break;
            case "NOVEMBER": M = 10;break;
            case "DECEMBER": M = 11;break;
        }
        int D = Integer.parseInt(dateString[1]);
        int Y = Integer.parseInt(dateString[1]);
*/

    }



    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date d = formatter.parse(date);
        /*Calendar Cal = new GregorianCalendar();
        Cal.setTime(d);
        Calendar NYCal = new GregorianCalendar();
        NYCal.set(Cal.YEAR, 0,1);*/
        Date n_y_d = new Date();
        n_y_d.setYear(d.getYear());
        n_y_d.setMonth(0);
        n_y_d.setDate(1);
        long ms = d.getTime() - n_y_d.getTime();
        int days = (int) (ms/(1000*60*60*24));
        System.out.println(days);


        return days % 2 == 0 ? false : true;
    }
}
