package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sumSales = 0;
        for (int index : purchases){
            sumSales += index;
        }
        return sumSales;
    }

    public int calculateMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase; }
        }
        return min;
    }

    public int calculateMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase; }
            }
        return max;
    }
}

