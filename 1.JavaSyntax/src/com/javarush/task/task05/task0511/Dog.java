package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    //напишите тут ваш код
    String name;
    int height;
    String color;

    //- Имя
    public void initialize(String name){
        this.name = name;
    }

    //- Имя, рост, цвет
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    //- Имя, рост
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
