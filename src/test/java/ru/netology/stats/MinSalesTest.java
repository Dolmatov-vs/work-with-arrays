package ru.netology.stats;

import org.junit.jupiter.api.Test;

class MinSalesTest {

    @Test
    void calculateMin() {
        MinSales minSales = new MinSales();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int min = minSales.calculate(purchases);

        for (int i = 0; i < purchases.length; i++) {
            if (min == purchases[i]) {
                System.out.printf("Номер месяца с минимальными продажами: " + (i+1) + "%n");
            }
        }
    }
}