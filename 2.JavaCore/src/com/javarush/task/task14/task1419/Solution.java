package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new RuntimeException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new InstantiationException());
        exceptions.add(new IllegalThreadStateException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IllegalMonitorStateException());
        exceptions.add(new IllegalStateException());
        exceptions.add(new IllegalFormatCodePointException(0));

        //напишите тут ваш код

    }
}
