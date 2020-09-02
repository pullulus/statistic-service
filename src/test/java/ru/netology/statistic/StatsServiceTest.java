package ru.netology.statistic;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateTotalSalesVolume() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.shouldCalculateTotalSalesVolume(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSalesVolume() {
        StatsService service = new StatsService();

        int total = 180;
        int expected = 15;

        int actual = service.shouldCalculateAverageSalesVolume(total);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthWithMaximum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.shouldCalculateMonthWithMaximum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthWithMinimum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.shouldCalculateMonthWithMinimum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAmountOfMonthsUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = 15;
        int expected = 5;

        int actual = service.shouldCalculateAmountOfMonthsUnderAverage(sales, average);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAmountOfMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = 15;
        int expected = 5;

        int actual = service.shouldCalculateAmountOfMonthsAboveAverage(sales, average);

        assertEquals(expected, actual);
    }
}