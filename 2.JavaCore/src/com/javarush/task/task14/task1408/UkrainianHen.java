package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }
    @Override
    public String getDescription() {
        String newD = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, this.getCountOfEggsPerMonth());
        return super.getDescription() + newD;
    }
}

