package ru.netology.stats;

import org.junit.jupiter.api.Test;

class MaxSalesTest {

    @Test
        void calculateMax() {
            MaxSales maxSales = new MaxSales();
            int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int max = maxSales.calculate(purchases);

            for (int i = 0; i < purchases.length; i++) {
                if (max == purchases[i]) {
                    System.out.printf("Номер месяца с максимальными продажами: " + (i+1) + "%n");
            }
        }
    }
}