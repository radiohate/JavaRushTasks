package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    //- Имя
    public Friend(String name){
        this.name = name;
    }

    //- Имя, возраст
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    //- Имя, возраст, пол
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public static void main(String[] args) {

    }
}
