package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(dog1  + "\n" + dog2 + "\n" + cat1 + "\n" + cat2);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {

            return "Duck";
        }
    }
    public static class Dog {
        public String toString() {

            return "Dog";
        }
    }
    public static class Cat {
        public String toString() {

            return "Cat";
        }
    }

    //напишите тут ваш код
}
