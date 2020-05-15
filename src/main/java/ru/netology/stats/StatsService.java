package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sumSales = 0;
        for (int index : purchases) {
            sumSales += index;
        }
        return sumSales;
    }

    public int calculateAverageAmount(int[] purchases) {
        StatsService averageAmount = new StatsService();
        int averageSum = (averageAmount.calculateSum(purchases)) / purchases.length;

        return averageSum;
    }

    public int salesHigherMiddle(int[] purchases) {
        StatsService averageAmount = new StatsService();
        int averageSum = (averageAmount.calculateSum(purchases)) / purchases.length;
        int quantityHight = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (averageSum < purchases[i])
                quantityHight++;
        }

        return quantityHight;
    }

    public int salesLowMiddle(int[] purchases) {
        StatsService averageAmount = new StatsService();
        int averageSum = (averageAmount.calculateSum(purchases)) / purchases.length;
        int quantitylow = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (averageSum > purchases[i])
                quantitylow++;
        }

        return quantitylow;
    }

    public int calculateMin(int[] purchases) {
        int min = purchases[0];
        int month = 0;
        for (int index : purchases) {
            if (min > index) {
                min = index;
            }
            for (int i = 0; i < purchases.length; i++) {
                if (min == purchases[i]) {
                    month = i + 1; }
            }
        }
        return month;
    }

    public int calculateMax(int[] purchases) {
        int max = purchases[0];
        int month = 0;
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
            for (int i = 0; i < purchases.length; i++) {
                if (max == purchases[i]) {
                    month = i + 1; }
            }
        }
        return month;
    }
}
