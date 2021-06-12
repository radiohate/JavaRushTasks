package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
У класса должен быть метод initialize,
принимающий в качестве параметра .
*/

public class Cat {
    int DEFAULT = 1;
    String DEFAULT_COLOR = "non-transparent";

    String name;
    int age;
    int weight;
    String address;
    String color;

    //имя, но инициализирующий все переменные класса, кроме адреса
    public void initialize(String name){
        this.name = name;
        this.age = this.DEFAULT;
        this.weight = this.DEFAULT;
        this.color = this.DEFAULT_COLOR;
    }
    //имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = this.DEFAULT_COLOR;
    }
    //имя, возраст и инициализирующий все переменные класса, кроме адреса
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = DEFAULT;
        this.color = this.DEFAULT_COLOR;
    }
    //вес, цвет и инициализирующий все переменные класса, кроме имени и адреса
    public void initialize(int weight, String color){
        this.age = DEFAULT;
        this.weight = weight;
        this.color = color;
    }
    // вес, цвет, адрес и инициализирующий все переменные класса, кроме имени
    public void initialize(int weight, String color, String address){
        this.age = DEFAULT;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    //напишите тут ваш код
}
