package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String nameClass = stackTraceElements[2].getClassName();
        String nameMethod = stackTraceElements[2].getMethodName();
        System.out.println(nameClass + ": " + nameMethod + ": " + text);
    }
}
