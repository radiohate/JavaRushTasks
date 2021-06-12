package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Data data = new Data(22,10,2020);
        System.out.println(data);
    }
    public static class Data{
        int dd;
        int mm;
        int yyyy;

        public Data(int dd, int mm, int yyyy){
            this.dd = dd;
            this.mm = mm;
            this.yyyy = yyyy;
        }

        @Override
        public String toString() {
            return dd + " " + mm + " "+ yyyy;
        }
    }
}
