package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
            int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 200;
            int actual = service.calculateSum(purchases);
            assertEquals(expected, actual);
        }

    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;
        int actual = service.averageSum(purchases);
        assertEquals(expected, actual);
    }
}