package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
        String dedName = reader.readLine();
        String babushkaName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat ded = new Cat(dedName);
        Cat babushka = new Cat(babushkaName);
        Cat father = new Cat(fatherName, ded);
        Cat mother = new Cat(babushka, motherName);
        Cat son = new Cat(sonName, mother, father);
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(ded);
        System.out.println(babushka);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        Cat(Cat mother, String name) {
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            if(mother == null && father != null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            if(mother != null && father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
