package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Human> family = new ArrayList<>();

        Human ded1 = new Human("ded1", true, 80);
        Human ded2 = new Human("ded2", true, 80);
        Human babushka1 = new Human("babushka1", false, 80);
        Human babushka2 = new Human("babushka2", false, 80);
        Human mama = new Human("mama", false, 55, ded1,babushka1);
        Human papa = new Human("papa", true, 55, ded2,babushka2);
        Human child1 = new Human("detka1", true, 20, papa, mama);
        Human child2 = new Human("detka2", true, 15, papa, mama);
        Human child3 = new Human("detka3", true, 10, papa, mama);
        Collections.addAll(family, ded1,ded2, babushka1,babushka2,mama,papa,child1,child2,child3);
        for(Human h: family) System.out.println(h);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}