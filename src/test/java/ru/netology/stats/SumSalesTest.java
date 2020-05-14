package ru.netology.stats;

import org.junit.jupiter.api.Test;

class SumSalesTest {

    @Test
    void SumSales() {
        SumSales sumSales = new SumSales();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = sumSales.calculate(purchases);

        System.out.printf("Сумма всех продаж = " + sum + "%n");
        System.out.printf("Среднюю сумму продаж в месяц = " + sum / purchases.length);
    }

    @Test
    void SalesHigherMiddle() {
        SumSales sumSales = new SumSales();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = sumSales.calculate(purchases);
        int quantityHight = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (sum / purchases.length > purchases[i])
                quantityHight += 1;}
        System.out.printf("Кол-во месяцев, в которых продажи были выше среднего: " + quantityHight);
        }

    @Test
    void SalesLowMiddle() {
        SumSales sumSales = new SumSales();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = sumSales.calculate(purchases);
        int quantityBelow = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (sum / purchases.length < purchases[i])
                quantityBelow += 1;}
        System.out.printf("Кол-во месяцев, в которых продажи были ниже среднего: " + quantityBelow);
    }
}