package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

//    @Test
//    void second_findMax() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {1, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 12;
//     long actual = service.findMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//
//
//    @Test
//    void lustFindMax() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 12;
//
//        long actual = service.lustFindMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void findLustMax() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 12;
//
//        long actual = service.findLustMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void findMin() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 3;
//
//        long actual = service.findMin(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void findSum() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 85;
//
//        long actual = service.findSum(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void findMiddleSum() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 7;
//
//        long actual = service.findMiddleSum(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void lustIndexMax() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 11;
//
//        long actual = service.lustIndexMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void minIndex() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 6;
//
//        long actual = service.minIndex(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void underMiddle() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 5;
//
//        long actual = service.underMiddle(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void overMiddle() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 6;
//
//        long actual = service.overMiddle(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }





}