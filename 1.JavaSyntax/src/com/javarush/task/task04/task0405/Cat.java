package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount = catsCount;

    }

    public static void main(String[] args) {
        Cat cat11 =new Cat();
        cat11.setCatsCount(2);
        System.out.println(cat11.catsCount);

    }
}
