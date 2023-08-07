package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class StataServiceTest {
    @Test
    public void calcSumSalesTest(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.calcSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void averageSalesTest(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void getMaxSalesTest(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void getMinSalesTest(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.getMinSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void salesBelowAverageTest(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.salesBelowAverage(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesAboveAverageTest(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveMonth = 5;
        int actualAboveMonth = service.salesAboveAverage(sales);
        Assertions.assertEquals(expectedAboveMonth, actualAboveMonth);
    }

}
