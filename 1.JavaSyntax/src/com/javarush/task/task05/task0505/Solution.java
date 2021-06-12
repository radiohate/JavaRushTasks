package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Cat1", 5, 12,5);
        Cat cat2 = new Cat("Cat2",8,9,4);
        Cat cat3 = new Cat("Cat3",5,6,8);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat3.fight(cat2));
            }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            //System.out.println(this.age+ " vc " + anotherCat.age + " = " + ageScore);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            //System.out.println(this.weight+ " vc " + anotherCat.weight + " = " + weightScore);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);
            //System.out.println(this.strength+ " vc " + anotherCat.strength + " = " + strengthScore);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
