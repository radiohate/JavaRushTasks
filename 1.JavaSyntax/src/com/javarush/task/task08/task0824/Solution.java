package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
два дедушки, две бабушки, отец, мать, трое детей
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<Human>();
        //ArrayList<Human> childrenOfChildren = new ArrayList<Human>();
        Human child1 = new Human("child1", true, 8, new ArrayList<Human>());
        Human child2 = new Human("child2", true, 9, new ArrayList<Human>());
        Human child3 = new Human("child3", true, 10, new ArrayList<Human>());
        ArrayList<Human> childrenOfParents = new ArrayList<Human>();
        childrenOfParents.add(child1);
        childrenOfParents.add(child2);
        childrenOfParents.add(child3);
        Human father = new Human("father", true, 40, childrenOfParents);
        Human mama = new Human("mama", false, 39, childrenOfParents);
        ArrayList<Human> childrenOfDB1 = new ArrayList<Human>();
        childrenOfDB1.add(father);
        ArrayList<Human> childrenOfDB2 = new ArrayList<Human>();
        childrenOfDB2.add(mama);
        Human ded1 = new Human("ded", true, 70, childrenOfDB1);
        Human babka1 = new Human("babka", false, 70, childrenOfDB1);
        Human ded2 = new Human("ded", true, 70, childrenOfDB2);
        Human babka2 = new Human("babka", false, 70, childrenOfDB2);
        family = new ArrayList(Arrays.asList(child1, child2,child3, father, mama, ded1,babka1, ded2,babka2));
        for(Human h: family) System.out.println(h);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        /*public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }*/
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
