package ru.netology.statistic;

public class StatsService {
    public int shouldCalculateTotalSalesVolume(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    public int shouldCalculateAverageSalesVolume(int total) {
        int average = total / 12;

        return average;
    }

    public int shouldCalculateMonthWithMaximum(int[] sales) {
        int maximum = sales[0];
        int indexForMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            int score = sales[i];
            if (maximum <= score) {
                maximum = score;
                indexForMaximum = i;
            }
        }
        int monthnumber = indexForMaximum + 1;

        return monthnumber;
    }

    public int shouldCalculateMonthWithMinimum(int[] sales) {
        int minimum = sales[0];
        int indexForMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            int score = sales[i];
            if (minimum >= score) {
                minimum = score;
                indexForMinimum = i;
            }
        }
        int monthnumber = indexForMinimum + 1;

        return monthnumber;
    }

    public int shouldCalculateAmountOfMonthsUnderAverage(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale < 15) {
                amount = amount + 1;
            }
        }

        return amount;
    }

    public int shouldCalculateAmountOfMonthsAboveAverage(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale > 15) {
                amount = amount + 1;
            }
        }

        return amount;
    }

}