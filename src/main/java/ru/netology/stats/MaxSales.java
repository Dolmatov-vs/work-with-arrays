package ru.netology.stats;

public class MaxSales {
    public int calculate(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase; }
        }
        return max;
    }
}





