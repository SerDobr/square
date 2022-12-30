package ru.netology.sqr.number.services;

import com.sun.java.accessibility.util.EventID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void rangeLimitsAreLessThanMin() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateSQR(1, 99);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limitsOfTheRangeAreGreaterThanMin() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calculateSQR(100, 1000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void boundariesOfTheRangeAreAverage() {
        SQRService service = new SQRService();
        int expected = 23;
        int actual = service.calculateSQR(1000, 3000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void boundariesOfTheRangeAreLargerThanTheAverage() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calculateSQR(6000, 9801);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void rangeLimitsAreGreaterThanMax() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateSQR(10000, 12000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxRangeboundaries() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calculateSQR(100, 9801);
        Assertions.assertEquals(expected, actual);

    }
}