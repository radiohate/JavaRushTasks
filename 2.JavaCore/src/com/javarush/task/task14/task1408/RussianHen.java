package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
    @Override
    public String getDescription() {
        String newD = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, this.getCountOfEggsPerMonth());
        return super.getDescription() + newD;
    }
}
