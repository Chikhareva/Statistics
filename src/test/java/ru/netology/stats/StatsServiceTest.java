package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
           int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 200;
            int actual =service.calculateSum(purchases);
            assertEquals(expected, actual);
        }

    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;
        int actual;
        actual = service.calculateAverageSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthSaleOverAverage() {
        StatsService service = new StatsService();
        int []purchases={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        int actual=service.calculateAverageSum(purchases);
        assertEquals(expected,actual);

    }

    @Test
    void salesMaximumMonth() {
        StatsService service = new StatsService();
        int expected=10;
        int actual= StatsService.salesMaximumMonth();
        assertEquals(expected,actual);
    }

    @Test
    void salesMinimumMonth() {
        StatsService service = new StatsService();
        int expected=14;
        int actual=StatsService.salesMinimumMonth();
        assertEquals(expected,actual);
    }
}