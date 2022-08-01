package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSalesMonthFoundProperly() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumOfSalesFoundProperly() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumOfSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesMonthFoundProperly() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.getAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void maxSalesFoundProperly() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMax = 8;
        long actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax,actualMax);

    }

    @Test
    public void countWorseMonthsProperly() {
        StatsService service = new StatsService();

        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedWorseMonths = 5;
        long actualWorseMonths = service.countWorseAverage(sales);

        Assertions.assertEquals(expectedWorseMonths,actualWorseMonths);
    }

    @Test
    public void countBetterMonthsProperly() {
        StatsService service = new StatsService();

        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBetterMonths = 5;
        long actualBetterMonths = service.countBetterAverage(sales);

        Assertions.assertEquals(expectedBetterMonths,actualBetterMonths);
    }

}
