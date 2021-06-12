package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    static int DEFAULT = 1;
    static String DEFAULT_COLOR = "non-transparent";

    String name;
    int age;
    int weight;
    String address;
    String color;

    //имя, но инициализирующий все переменные класса, кроме адреса
    public Cat(String name){
        this.name = name;
        this.age = DEFAULT;
        this.weight = DEFAULT;
        this.color = DEFAULT_COLOR;
    }

    //имя, вес, возраст и инициализирующий все переменные класса, кроме адреса
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = DEFAULT_COLOR;
    }

    //имя, возраст и инициализирующий все переменные класса, кроме адреса
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = DEFAULT;
        this.color = DEFAULT_COLOR;
    }

    //вес, цвет и инициализирующий все переменные класса, кроме имени и адреса
    public Cat(int weight, String color){
        this.age = DEFAULT;
        this.weight = weight;
        this.color = color;
    }

    //вес, цвет, адрес и инициализирующий все переменные класса, кроме имени
    public Cat(int weight, String color, String address){
        this.age = DEFAULT;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {
        Cat cat = new Cat(2, "blc", "msk");
        System.out.println(cat.name + " // " + cat.age + " // " + cat.weight + " // " + cat.color + " // " + cat.address);

    }
}
