package ru.netology.stats;

public class StatsService {

    public int calculateSum (int[] purchases) {
        int sumSales = 0;
        for (int index : purchases){
            sumSales += index;
        }
        return sumSales;
    }

    public int calculateAverageAmount (int[] purchases) {
        StatsService averageAmount = new StatsService();
        int averageSum = (averageAmount.calculateSum(purchases)) / purchases.length;

        return averageSum;
    }

    public int SalesHigherMiddle (int[] purchases) {
        StatsService averageAmount = new StatsService();
        int averageSum = (averageAmount.calculateSum(purchases)) / purchases.length;
        int quantityHight = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (averageSum < purchases[i])
                quantityHight += 1;}

        return quantityHight;
    }

    public int SalesLowMiddle (int[] purchases) {
        StatsService averageAmount = new StatsService();
        int averageSum = (averageAmount.calculateSum(purchases)) / purchases.length;
        int quantitylow = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (averageSum > purchases[i])
                quantitylow += 1;}

        return quantitylow;
    }

    public int calculateMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
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

