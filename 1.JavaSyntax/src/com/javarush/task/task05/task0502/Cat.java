package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int thisPoint = 0;
        int anotherPoint = 0;
        if(this.strength > anotherCat.strength) thisPoint++;
        else if(this.strength < anotherCat.strength) anotherPoint++;

        if(this.weight > anotherCat.weight) thisPoint++;
        else if(this.weight < anotherCat.weight) anotherPoint++;

        if(this.age > anotherCat.age) thisPoint++;
        else if(this.age < anotherCat.age)anotherPoint++;

        if(thisPoint > anotherPoint) return true;
        else return false;

    }

    public static void main(String[] args) {

    }
}
