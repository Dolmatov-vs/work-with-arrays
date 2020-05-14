package ru.netology.stats;

import org.junit.jupiter.api.Test;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 16, 14, 14, 18};

    @Test
    void SumSales() {
        StatsService sumSales = new StatsService();
        int sum = sumSales.calculateSum(purchases);

        System.out.printf("Сумма всех продаж = " + sum + "%n");
    }

    @Test
    void AverageAmount() {
        StatsService averageAmount = new StatsService();
        int averageSum = averageAmount.calculateAverageAmount(purchases);

        System.out.printf("Среднюю сумму продаж в месяц = " + averageSum);
    }

    @Test
    void SalesHigherMiddle() {
        StatsService quantityHight = new StatsService();
        int value = quantityHight.SalesHigherMiddle(purchases);
        System.out.printf("Кол-во месяцев, в которых продажи были выше среднего: " + value);
    }

    @Test
    void SalesLowMiddle() {
        StatsService quantityLow = new StatsService();
        int value = quantityLow.SalesLowMiddle(purchases);
        System.out.printf("Кол-во месяцев, в которых продажи были ниже среднего: " + value);
    }

    @Test
    void calculateMin() {
        StatsService minSales = new StatsService();
        int min = minSales.calculateMin(purchases);

        for (int i = 0; i < purchases.length; i++) {
            if (min == purchases[i]) {
                System.out.println("Номер месяца с минимальными продажами: " + (i+1)); }
        }
    }


    @Test
    void calculateMax() {
        StatsService maxSales = new StatsService();
        int max = maxSales.calculateMax(purchases);

        for (int i = 0; i < purchases.length; i++) {
            if (max == purchases[i]) {
                System.out.println("Номер месяца с максимальными продажами: " + (i+1) ); }
        }
    }
}