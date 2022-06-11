package ru.netology.sgr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiseTest {

    @Test
    public void shouldSumStats() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.SumStats(stats);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageAmountStats() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.AverageAmountStats(stats);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 7;
        int actual = service.MaxSales(stats);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.MinSales(stats);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowAverage() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.BelowAverage(stats);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveAverage() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.AboveAverage(stats);

        Assertions.assertEquals(expected, actual);
    }

}

