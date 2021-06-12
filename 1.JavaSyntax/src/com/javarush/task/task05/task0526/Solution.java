package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
name + " " + age + " " + address
*/

import javax.sound.midi.Soundbank;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman1 = new Woman("radiokate", 31, "Tokyo");
        Woman woman2 = new Woman("radiokate", 31, "Moscow");
        Man man1 = new Man("e", 31, "Tokyo");
        Man man2 = new Man("d", 31, "Moscow");
        System.out.println(woman1 + "\n" + woman2  + "\n" + man1 + "\n" + man2);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }

    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }

    }
}
