package com.javarush.task.task06.task0619;

/* 
Три статические переменные name
*/

public class Solution {
    public static String name = "Solution";

    public static class Cat {
        public static String name = "Cat";
    }

    public static class Dog {
        public static String name = "Dog";
    }

    public static void main(String[] args) {
        System.out.println(new Cat().name);
        System.out.println(new Dog().name);
        System.out.println(new Solution().name);

    }
}
