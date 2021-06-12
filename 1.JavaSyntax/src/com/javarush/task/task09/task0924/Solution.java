package com.javarush.task.task09.task0924;

import java.util.ArrayList;

/* 
Страшная сказка
*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Wolf wolf = new Wolf();
    public static Woodman woodman = new Woodman();


    public static void main(String[] args) {
        // напишите тут ваш код
    }

    // Красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    // Бабушка
    public static class Grandmother extends StoryItem {
    }

    // Пирожок
    public static class Patty extends StoryItem {
    }

    // Дровосек
    public static class Woodman extends StoryItem {
        public Woodman(){
            this.killed.add(wolf);
        }
    }

    // Волк
    public static class Wolf extends StoryItem {
        public Wolf(){
            this.ate.add(grandmother);
            this.ate.add(hood);
        }
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
