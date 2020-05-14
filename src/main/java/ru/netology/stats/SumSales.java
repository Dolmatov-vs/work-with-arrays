package ru.netology.stats;

public class SumSales {
    public int calculate(int[] purchases) {
        int sumSales = 0;
        for (int purchase : purchases){
            sumSales += purchase;
        }
        return sumSales;
    }
}
