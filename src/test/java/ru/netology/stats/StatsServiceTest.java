package ru.netology.stats;

import org.junit.jupiter.api.Test;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 16, 14, 14, 18};

    @Test
    void SumSales() {
        StatsService sumSales = new StatsService();
        int sum = sumSales.calculateSum(purchases);

        System.out.printf("Сумма всех продаж = " + sum + "%n");
        System.out.printf("Среднюю сумму продаж в месяц = " + sum / purchases.length);
    }

    @Test
    void SalesHigherMiddle() {
        StatsService sumSales = new StatsService();
        int sum = sumSales.calculateSum(purchases);
        int quantityHight = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (sum / purchases.length > purchases[i])
                quantityHight += 1;}
        System.out.printf("Кол-во месяцев, в которых продажи были выше среднего: " + quantityHight);
    }

    @Test
    void SalesLowMiddle() {
        StatsService sumSales = new StatsService();
        int sum = sumSales.calculateSum(purchases);
        int quantityBelow = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (sum / purchases.length < purchases[i])
                quantityBelow += 1;}
        System.out.printf("Кол-во месяцев, в которых продажи были ниже среднего: " + quantityBelow);
    }

    @Test
    void calculateMin() {
        StatsService minSales = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int min = minSales.calculateMin(purchases);

        for (int i = 0; i < purchases.length; i++) {
            if (min == purchases[i]) {
                System.out.printf("Номер месяца с минимальными продажами: " + (i+1) + "%n"); }
        }
    }

    @Test
    void calculateMax() {
        StatsService maxSales = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int max = maxSales.calculateMax(purchases);

        for (int i = 0; i < purchases.length; i++) {
            if (max == purchases[i]) {
                System.out.println("Номер месяца с максимальными продажами: " + (i+1) ); }
        }
    }
}