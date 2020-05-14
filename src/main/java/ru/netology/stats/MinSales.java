package ru.netology.stats;

public class MinSales {
    public int calculate(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase; }
        }
        return min;
    }
}
