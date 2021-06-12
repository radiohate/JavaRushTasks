package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
String name, возраст int age, пол char sex.
*/

public class Person {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }
    public char getSex(){
        return this.sex;
    }

    public static void main(String[] args) {

    }
}
