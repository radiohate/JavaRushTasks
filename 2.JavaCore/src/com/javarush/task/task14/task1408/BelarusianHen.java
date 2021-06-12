package com.javarush.task.task14.task1408;
//<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
//где Sssss - название страны
//где N - количество яиц в месяц
public class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        String newD = String.format(" Моя страна - %s. Я несу %d яиц в месяц.",Country.BELARUS, this.getCountOfEggsPerMonth());
        return super.getDescription() + newD;
    }
}
