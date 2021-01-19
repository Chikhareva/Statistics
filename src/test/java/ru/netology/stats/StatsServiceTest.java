package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 200;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 20;
        int actual;
        actual = service.calculateAverageSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void salesMaximumMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.salesMaximumMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void salesMinimumMonth() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 14;
        int actual = service.salesMinimumMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthSaleOverAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 10;
        int actual = service.calculateMonthOverAverageSum(purchases);
        assertEquals(expected, actual);


    }

    @Test
    void calculateMonthUnderAverageSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 10;
        int actual = service.calculateMonthUnderAverageSum(purchases);
        assertEquals(expected, actual);
    }
}
