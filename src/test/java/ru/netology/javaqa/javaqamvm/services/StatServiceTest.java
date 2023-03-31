package ru.netology.javaqa.javaqamvm.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatService;

public class StatServiceTest {

    @Test
    public void shouldFindTotalSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateTotalSum(sales);

        Assertions.assertEquals(180, actual);
    }

    @Test
    public void shouldFindAverageSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateAverageSum(sales);

        Assertions.assertEquals(15, actual);

    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.findMaxSalesMonth(sales);

        Assertions.assertEquals(8, actual);

    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.findMinSalesMonth(sales);

        Assertions.assertEquals(9, actual);

    }

    @Test
    public void shouldCalculateBelowAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateBelowAverage(sales);

        Assertions.assertEquals(5, actual);

    }

    @Test
    public void shouldCalculateUpperAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateUpperAverage(sales);

        Assertions.assertEquals(5, actual);

    }
}