package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void sumTest(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;
        Assertions.assertEquals(expected , actual);

    }
    @Test
    void averageTest(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18) / 12;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    void maximumTest(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maximum(sales);
        long expected = 7;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    void minimumTest(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minimum(sales);
        long expected = 8;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    void LowerAverageTest(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.mountLowerAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    void AboveAverageTest(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.mountLowerAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected , actual);
    }
}
