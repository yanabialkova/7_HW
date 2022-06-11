package ru.netology.sgr;

public class StatsService {

    public int SumStats(int[] stats) {
        int sum = 0;

        for (int i = 0; i < stats.length; i++) {
            sum = sum + stats[i];
        }
        return sum;
    }

    public int AverageAmountStats(int[] stats) {
        int sum = 0;
        int averageAmount = 0;
        for (int i = 0; i < stats.length; i++) {
            sum = sum + stats[i];
            averageAmount = sum / stats.length;
        }
        return averageAmount;
    }

    public int MaxSales(int[] sales) {

        int max = 0;
        int IndexMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                IndexMonth = i;
            }
        }
        return IndexMonth;
    }

    public int MinSales(int[] sales) {

        int min = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min;

    }

    public int BelowAverage(int[] sales) {

        int array = AverageAmountStats(sales);
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (array > sales[i]) {
               month++;
            }
        }
        return month;
    }

    public int AboveAverage(int[] sales) {

        int array = AverageAmountStats(sales);
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (array < sales[i]) {
                month++;
            }
        }
        return month;
    }
}
