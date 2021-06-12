package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(method1());
        //method1();

    }

    public static String method1() {
        System.out.println(method2());
        //method2();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        System.out.println(method3());
        //method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        System.out.println(method4());
        //method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        System.out.println(method5());
        //method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        //StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        /*for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }*/

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
